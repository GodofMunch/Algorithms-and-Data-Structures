public class MyArraysTest {

    public static void main(String[] args) {

        testRemoveItem();
        testAddItem();
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

        String arrayText = "";

        for(int i = 0; i < array.length;i++)


    }
}
