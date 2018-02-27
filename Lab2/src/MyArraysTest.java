public class MyArraysTest {

    public static void main(String[] args) {

        testRemoveItem();
        testAddItem();
        testSum();
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

        System.out.println(arrayText);
        itemsUsed = MyArrays.removeItem(listOfItems, listOfItems.length, 3);

        arrayText = "";

        for (int i = 0; i < listOfItems.length; i ++) {
            arrayText += "\n" + listOfItems[i];
        }

        System.out.print(arrayText);
    }

    public  static  void testAddItem() {

        int currentSize = 0;

        int[] array = {2,4,6,8,10,12,16,18,20,0,0,0,0,0};

        String arrayText = "\n\n";

        for(int i = 0; i < array.length;i++)
        {
            if(array[i] != 0 && array[i+1] ==0)
                currentSize = i;
        }

        MyArrays.addItem(array,currentSize, currentSize +1, 22);

        for(int i = 0; i < array.length; i++)
            arrayText += array[i] + ",";

        System.out.println(arrayText);
    }

    public static void testSum() {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int sum = MyArrays.sumArray(array,array.length);

    }
}
