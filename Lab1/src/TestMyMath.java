import java.util.Scanner;

public class TestMyMath {
    public static void main(String[] args) {

        maxValueTest();
        powTest();
        factorialTest();
        sumOfNumbersTest();
        isPrimeNumberTest();
        //validPasswordTest();
        numOfEntriesTest();
    }

    public static void maxValueTest() {
        /*Three integer values are passed through, in different sequence,
         having the highest first in the first run through, highest second
         in the second and third in the third*/

        int highest = 100;
        int middle = 75;
        int lowest = 50;

        System.out.print("The first call results in (expected 100) :" +
                MyMath.maxValue(highest, middle, lowest) +
                "\nThe second call results in (expected 100) :" +
                MyMath.maxValue(middle, highest, lowest) +
                "\nThe third call results in (expected 100) :" +
                MyMath.maxValue(lowest, middle, highest));
    }

    public static void powTest() {

        /*This tests sends in two positive integers to test to see if
        the calculation of a power is correct*/

        int firstBase = 2;
        int secondBase = 14;
        int thirdBase = 7;
        int firstExp = 10;
        int secondExp = 5;
        int thirdExp = 11;

        System.out.print("\n\nThe first call asks for two to the power " +
                "of 10 (expected 1,024) : " + MyMath.pow(firstBase, firstExp) +
                "\nThe second call asks for 14 to the power " +
                "of 5 (expected 537,824) : " + MyMath.pow(secondBase, secondExp) +
                "\nThe third call asks for 7 to the power " +
                "of 11 (expected 1,977,326,743) : " + MyMath.pow(thirdBase, thirdExp));
    }

    public static void factorialTest() {

        /*This test asks for a positive integer that the factorial
        test is performed on*/

        int intOne = 0;
        int intTwo = 7;
        int intThree = 12;

        System.out.print("\n\nThe first call asks for 0!(expected 0) : " +
                MyMath.factorial(intOne) + "\nThe second call asks for 7! " +
                "(expected 5,040) : " + MyMath.factorial(intTwo) +
                "\nThe third call asks for 12! (expected 479,001,600) : " +
                MyMath.factorial(intThree));

    }

    public static void sumOfNumbersTest() {

        /*This method asks for a positive integer that then
        calculates the sum of the numbers up until that number*/

        int intOne = 6;
        int intTwo = 21;
        int intThree = 231;

        System.out.print("\n\nThe first call asks for the sum of numbers up " +
                "to and including 6 (expected 21) : " + MyMath.sumOfNumbers(intOne) +
                "\nThe second call asks for the sum of numbers up " +
                "to and including 21 (expected 231) : " + MyMath.sumOfNumbers(intTwo) +
                "\nThe second call asks for the sum of numbers up " +
                "to and including 231 (expected 26796) : " + MyMath.sumOfNumbers(intThree));

    }

    public static void isPrimeNumberTest() {

        /*This test asks for a positive integer value that examines to see
        if the input is a prime number*/

        int primeNumOne = 89;
        int primeNumTwo = 97;
        int primeNumThree = 23;
        int notPrimeOne = 46;
        int notPrimeTwo = 35;
        int notPrimeThree = 69;

        int testNum = 1;
        String testNumString = "\n";
        String testResult = " ";

        for(int i = 0; i < 6; i++) {
            if(i == 0) {
                System.out.print(testNumString);
                testNumString = "first";
                testNum = primeNumOne;
            }

            else if(i == 1) {
                testNumString = "second";
                testNum = notPrimeOne;
            }

            else if(i == 2) {
                testNumString = "third";
                testNum = primeNumTwo;
            }

            else if(i == 3) {
                testNumString = "fourth";
                testNum = notPrimeTwo;
            }

            else if(i == 4) {
                testNumString = "fifth";
                testNum = primeNumThree;
            }
            else {
                testNumString = "sixth";
                testNum = notPrimeThree;
            }

            if(MyMath.isPrimeNumber(testNum))
                testResult = " is a prime number (expected true)";
            else if(!MyMath.isPrimeNumber(testNum))
                testResult = " is not a prime number (expected false)";

            System.out.print("\nThe " + testNumString + " test for " + testNum +
            testResult);
        }

    }

    public static void validPasswordTest() {

        /*This test for a valid password  takes in a string and must fulfill three criteria :
        1. Must be 8 characters long
        2. Must have at least one UpperCase character and one Lowercase character
        3. Must have at least one digit
         */
        Scanner input = new Scanner(System.in);
        String passWord = "";

        System.out.print("\n\nThis test for a valid password takes in a string and must fulfill three criteria :\n" +
                "                        1. Must be 8 characters long\n" +
                "                        2. Must have at least one UpperCase character and one Lowercase character\n" +
                "                        3. Must have at least one digit");
        while(!MyMath.validPassword(passWord)) {
            System.out.print("\nPlease enter a password : ");
            passWord = input.nextLine();
        }

        System.out.print("Thank you, this password is valid!");
    }

    public static void numOfEntriesTest() {

        /*This method takes several user inputs and checks to see how many numbers between
        1 and 100 were entered. For the purpose of this test, a random amount of random
        numbers between 1 and 100 will be generated and will end when a negative integer is entered
         */

        int randomNumOfEntries = (int) (Math.random() * 1000) + 1;
        int total = 0;

        int[] arrayToHoldEntries = new int[randomNumOfEntries];
        int[] answerArray;


        for(int i = 0; i < arrayToHoldEntries.length; i++) {

            arrayToHoldEntries[i] = (int) (Math.random() * 100);
        }

        answerArray = MyMath.numOfEntries(arrayToHoldEntries);

        System.out.print("\n");

        for(int i = 0; i < answerArray.length; i++) {
            System.out.print("\n" + i + " : " + answerArray[i]);
            total += answerArray[i];
        }

        System.out.print("\n\nTotal (expected " + randomNumOfEntries + ") = " + total);
    }
}
