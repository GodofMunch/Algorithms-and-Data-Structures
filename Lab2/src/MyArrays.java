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

    public static int sumArray(int[] list, int currentSize) {

        int sum = 0;

        for(int i = 0; i < currentSize; i++)
            sum += list[i];

        return sum;
    }

    public static int maxOfArray(int[] list, int currentSize) {
        int max = list[0];

        for(int i = 0; i < currentSize; i++)
            if(list[i] > max)
                max = list[i];

        return max;
    }

    public static int minOfArray(int[] list, int currentSize) {
        int min = list[0];

        for(int i = 0; i < currentSize; i++)
            if(list[i] < min)
                min = list[i];

        return min;
    }
}
