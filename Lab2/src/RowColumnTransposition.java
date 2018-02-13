public class RowColumnTransposition {

    public static String encrypt(String plainText, int numColumns) {

        int numRows;

        String plainTextNoSpaces;

        plainTextNoSpaces = plainText.replace(" ", "");

        plainTextNoSpaces = plainTextNoSpaces.toUpperCase();

        while(plainTextNoSpaces.length()%numColumns!=0) {
            plainTextNoSpaces += "X";
        }

        numRows = plainTextNoSpaces.length()/numColumns;

        String cipherText = "";

        for(int col = 0; col < numColumns; col ++) {
            int index = col;

            for(int row = 0; row < numRows; row++) {
                    cipherText = cipherText + plainTextNoSpaces.charAt(index);
                    index += numColumns;
            }
            cipherText += ' ';
        }
     return cipherText;
    }

   /* public static String decrypt(String plainText, int numColumns) {

    }*/

    //JIAOTLIUUVRNAESGSEEJLBEHTMAUIINXGESSTTOX
}
