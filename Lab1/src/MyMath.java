//MyMath.java
/*This Class contains a few algorithms to be tested by the main TestMyMath.java class*/

public class MyMath {

    public static int maxValue(int a, int b, int c) {
        int maxValue = a;

        if(b > maxValue)
            maxValue = b;

        if(c > maxValue)
            maxValue = c;

        return maxValue;
    }

    public static int pow(int a, int b) {

        int answer = 1;

        if(a == 1) {
            answer = 1;
        }

        else
            answer = a;
        for (int i = 0; i < b - 1; i++) {
            answer = a*answer;
        }
        return answer;
    }

    public static int factorial(int n) {

        int answer = 1;

        for(int i = 1; i <= n; i++) {
            answer = answer * i;
        }

        return answer;
    }

    public static int sumOfNumbers(int a) {

        int answer = 0;

        for(int i = 0; i <= a; i++) {
            answer += i;
        }
        return answer;
    }

    public static boolean isPrimeNumber(int n) {

        boolean isPrime;
        int divisor = 0;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                divisor++;
            }
        }

        if(divisor >= 1)
            isPrime = false;
        else
            isPrime = true;

        return isPrime;
    }

    public static boolean validPassword(String password) {

        boolean isValid = false;
        boolean hasUpper = false;
        boolean hasLower = false;

        if(password.length() >= 8) {

            for(int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i)))
                    hasUpper = true;

                if(Character.isLowerCase(password.charAt(i)))
                    hasLower = true;
            }

            if(hasUpper && hasLower)
                for(int i = 0;i < password.length(); i ++)
                    if (Character.isDigit(password.charAt(i))) {
                        isValid = true;
                    }
        }
        return isValid;
    }

    public static int[] numOfEntries(int[] listOfEntries) {

        int[] numOfEntries = new int[100];
        int index;

        for (int k = 0; k < numOfEntries.length; k++)
            numOfEntries[k] = 0;

        for (int i = 0; i < listOfEntries.length; i++) {
            index = listOfEntries[i];

            numOfEntries[index]++;
        }

        return numOfEntries;
    }
}

