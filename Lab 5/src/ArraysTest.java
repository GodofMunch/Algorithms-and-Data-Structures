import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        testSort();
        testSortParams();
    }

    public static void testSort() {
        int[] newArray = {34,23,67,56,34,12,89,67,45,23};
        String arrayText = "";
        Arrays.sort(newArray);

        for(int i = 0;i < newArray.length; i++)
            arrayText += newArray[i] + ", ";

        System.out.println("expected = 12, 23, 23, 34, 34, 45, 56, 67, 67, 89" +
                "\nActual :   " + arrayText);
    }

    public static void testSortParams() {
        int[] newArray = {34,23,67,56,34,12,89,67,45,23};
        int firstIndex = 4, secondIndex = 8;
        String arrayText = "";

        Arrays.sort(newArray, firstIndex, secondIndex);

        for(int i = 0; i < newArray.length; i++)
            arrayText += newArray[i] + ", ";

        System.out.println("\n\nExpected : 34, 23, 67, 56, 12, 34, 67, 89, 45, 23," +
                "\nActual :   " + arrayText);
    }
}
