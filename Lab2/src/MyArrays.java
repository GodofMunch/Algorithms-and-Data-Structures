public class MyArrays {
    /**
     * Method = removeItem
     * Description = remove an item from an integer array given the index of the item to be removed
     * @author Dave O'Sullivan
     * @param list
     * @param currentSize
     * @param position
     * @return int
     */
    public static int removeItem(int [] list, int currentSize, int position) {

        for(int i = position+1; i < currentSize; i ++) {
            list[i-1] = list[i];
        }
        list[currentSize-1] = 0;

        return currentSize-1;
    }

    /**
     * Method = addItem
     * Description = add an item to an integer array given the index of where the item is to go and
     *               given the item to be added
     * @author Dave O'Sullivan
     * @param list
     * @param currentSize
     * @param position
     * @param newValue
     * @return
     */

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

    /**
     * Method = sumArray
     * Description = return the sum of values of an integer array
     * @author Dave O'Sullivan
     * @param list
     * @param currentSize
     * @return
     */
    public static int sumArray(int[] list, int currentSize) {

        int sum = 0;

        for(int i = 0; i < currentSize; i++)
            sum += list[i];

        return sum;
    }

    /**
     * Method = maxOfArray
     * Description = return the largest value of an integer array
     * @author Dave O'Sullivan
     * @param list
     * @param currentSize
     * @return
     */
    public static int maxOfArray(int[] list, int currentSize) {
        int max = list[0];

        for(int i = 0; i < currentSize; i++)
            if(list[i] > max)
                max = list[i];

        return max;
    }

    /**
     * Method = minOfArray
     * Description = return the smallest value of an integer array
     * @author Dave O'Sullivan
     * @param list
     * @param currentSize
     * @return
     */
    public static int minOfArray(int[] list, int currentSize) {
        int min = list[0];

        for(int i = 0; i < currentSize; i++)
            if(list[i] < min)
                min = list[i];

        return min;
    }

    /**
     * Method = linearSearch
     * Description = returns the index of an integer value in an array if it is found.
     *               If it is not found, the method returns -1.
     * @author Dave O'Sullivan
     * @param a
     * @param currentSize
     * @param searchKey
     * @return
     */
    public static int linearSearch(int[] a, int currentSize, int searchKey) {

        int i = 0;
        boolean found = false;

        while(!found && i < currentSize) {
            if(a[i] == searchKey)
                found = true;
            else
                i++;
        }

        if(found)
            return i;
        else
            return -1;
    }

    /**
     * Method = merge
     * Description = returns an integer array that is merged from two other sorted arrays
     * @author Dave O'Sullivan
     * @param aOne
     * @param leftOne
     * @param rightOne
     * @param aTwo
     * @param leftTwo
     * @param rightTwo
     * @return
     */
    public static int[] merge(int[] aOne, int leftOne, int rightOne, int[] aTwo, int leftTwo, int rightTwo) {

        int i = leftOne;
        int j = leftTwo;
        int k = 0;

        int arraySize = rightOne - leftOne + 1 + rightTwo - leftTwo + 1;
        int[] aThree = new int[arraySize];

        while (i <= rightOne && j <= rightTwo) {

            if (aOne[i] <= aTwo[j]) {  //Crashing on i == 4 whereas aOnes's last index == 3

                aThree[k] = aOne[i];
                i++;
                k++;
            } else {

                aThree[k] = aTwo[j];
                j++;
                k++;
            }
        }

        if (i <= rightOne)
            for (int m = i; m <= rightOne; m++) {
                aThree[k] = aOne[m];
                k++;
            }

        else
            for (int m = j; m <= rightTwo; m++) {
                aThree[k] = aTwo[m];
                k++;
            }

        return aThree;
    }

    /**
     *
     * @param myArray
     * @param currentSize
     * @param searchKey
     * @return
     */
    public static int binarySearch(int[] myArray,int currentSize,int searchKey) {
        int l = 0;
        int r = currentSize-1;
        boolean found = false;

        while(!found && l <=r ) {
            int m = (l + r) / 2;

            if(searchKey == myArray[m])
                found = true;

            else if(searchKey < myArray[m])
                r = m-1;
            else
                l = m+1;
        }

        if(found)
            return 1;
        else
            return 0;
    }

    /**
     *
     * @param myArray
     * @param currentSize
     */
    public static void selectionSort(int[] myArray, int currentSize) {


        int smallestPosition = 0;
        int smallest = myArray[smallestPosition];
        int temp = 0;

        for(int firstIndex = 0; firstIndex <= (currentSize-2); firstIndex ++) {

            smallest = myArray[firstIndex];
            for(int secondIndex = firstIndex; secondIndex <= (currentSize-1); secondIndex ++)
                if(myArray[secondIndex] <= smallest) {
                    smallestPosition = secondIndex;
                    smallest = myArray[smallestPosition];
                }

            if( smallestPosition != firstIndex) {
                temp = myArray[firstIndex];
                myArray[firstIndex] = smallest;
                myArray[smallestPosition] = temp;

            }
        }
    }
    /**
     *
     * @param a
     * @param currentSize
     */

    public static void insertionSort(int[] a, int currentSize) {

        int value;
        int j;

        for(int i = 1; i <= currentSize; i++) {
            value = a[i];
            j = i - 1;

            while(j >= 0 && a[j] > value) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = value;
        }
    }

    public static void sort(int[] myArray) {
        //Java API = Dual Pivot sort Algorithm
    }

    public static void sort(int[] myArray, int fromIndex, int toIndex) {
        //Java API = Dual Pivot sort Algorithm
    }
}
