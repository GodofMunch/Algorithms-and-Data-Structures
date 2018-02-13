public class MyArrays {

    public static int removeItem(int [] list, int currentSize, int position) {

        for(int i = position+1; i < currentSize; i ++) {
            list[i-1] = list[i];
        }
        list[currentSize-1] = 0;

        return currentSize-1;
    }

    public static int addItem(int[] list, int currentSize, int position, int newValue)
    {
        if(currentSize<list.length) {
            for (int i = currentSize - 1; i >= position; i--)
                list[i+1] = list[i];

            list[position] = newValue;

            currentSize ++;
        }

        return currentSize;
    }
}
