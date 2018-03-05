public class MyArraysTest {

    public static void main(String[] args) {

        testRemoveItem();
        testAddItem();
        testSum();
        testMin();
        testMax();
        testLinearSearch();
        testMerge();
    }

    public static void testRemoveItem() {

        int itemsUsed=0;
        int[] listOfItems = new int[5];



        listOfItems[0] = 12;
        itemsUsed++;
        listOfItems[1] = 24;
        itemsUsed++;
        listOfItems[2] = 36;
        itemsUsed++;
        listOfItems[3] = 48;
        itemsUsed++;
        listOfItems[4] = 60;
        itemsUsed++;

        String arrayText = "";

        for (int i = 0; i < listOfItems.length; i ++)
            arrayText += "\n" + listOfItems[i];

        System.out.println("\n\nTest Remove Item\n\n" + arrayText);
        itemsUsed = MyArrays.removeItem(listOfItems, listOfItems.length, 3);

        arrayText = "";

        for (int i = 0; i < listOfItems.length; i ++) {
            arrayText += "\n" + listOfItems[i];
        }

        System.out.print("\n\nExpected :\n12\n24\n36\n48\n0 \n\nActual :" + arrayText);
    }

    public  static  void testAddItem() {

        int currentSize = 0;

        int[] array = {2,4,6,8,10,12,16,18,20,0,0,0,0,0};

        String arrayText = "";

        for(int i = 0; i < array.length;i++)
        {
            if(array[i] != 0 && array[i+1] == 0)
                currentSize = i;
        }

        MyArrays.addItem(array,currentSize, currentSize +1, 22);

        for(int i = 0; i < array.length; i++)
            arrayText += array[i] + ",";

        System.out.println("\n\nTest add Item\n\nExpected 2,4,6,8,10,12,14,16,18,20,22,0,0,0,0 \nActual = " + arrayText);
    }

    public static void testSum() {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int sum = MyArrays.sumArray(array,array.length);

        System.out.print("\n\nTest Sum:\n\nExpected - 210 - Actual - " + sum);

    }

    public static void testMin() {
        int[] list = {2,4,6,8,0,34,22,66};

        int smallest = MyArrays.minOfArray(list, list.length);

        System.out.println("\n\nTest Minimum of Array\nExpected : 0\nActual :  " + smallest);
    }

    public static void testMax() {
        int[] list = {23, 67, 1, 67, 89, 45, 99, 12};

        int largest = MyArrays.maxOfArray(list, list.length);

        System.out.println("\n\nTest Maximum of array\nExpected : 99\nActual :  " + largest);
    }

    public static void testLinearSearch() {
        int[] list = {12,23,34,45,56,67,78,89,90};

        int key = 34;
        int indexOfKey = MyArrays.linearSearch(list, list.length, key);

        System.out.println("\n\nTest Linear Search\n\n Looking for " + key + "\nExpected : 2\nActual : " + indexOfKey +
                            " (found at index " + indexOfKey + ")");

        key = 44;
        indexOfKey = MyArrays.linearSearch(list, list.length, key);

        System.out.println("\n\nTest Linear Search\n\nLooking for " + key + "\nExpected : -1 (not found) " +
                           "Actual : " + indexOfKey);
    }

    public static void testMerge() {

        int[] sortedArrayOne = {23,55,66,99};
        int[] sortedArrayTwo = {11,12,34,100,156,200};

        int[] mergedArray = MyArrays.merge(sortedArrayOne, 0, sortedArrayOne.length, sortedArrayTwo, 0, sortedArrayTwo.length);

        String mergedArrayToString = "\n";
        for(int i = 0; i < mergedArray.length; i++)
            mergedArrayToString += mergedArray[i] + ",";

        System.out.println("\n\nTest Merge\n\nExpected 11,12,23,34,55,66,99,100,156,200,\nActual : " + mergedArrayToString);
    }
}
