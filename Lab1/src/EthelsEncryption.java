public class EthelsEncryption {

    public static String encrypt(String message, int offset) {

        final int OFFSET = offset;
        int intCharacter;
        int upperCaseA = 'A';
        char[] characters = new char[message.length()];
        String newMessage="";
        message = message.toUpperCase();

        for(int i=0; i<message.length();i++) {
            intCharacter = (int)message.charAt(i);

            if((intCharacter + OFFSET > upperCaseA + 25)) //25 = length of Alphabet - 1(A)
                intCharacter = intCharacter-26; //26 = length of alphabet
            if(message.charAt(i)!=' ')
                characters[i] = (char)(intCharacter + OFFSET);
            else
                characters[i] = (char)(intCharacter);
            newMessage += characters[i];
        }
        //newMessage = String.valueOf(characters);
        //System.out.print(message);

        return newMessage;
    }
}
