import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class TownSortDemo {
    public static void main(String[] args) {
        Town[] towns = new Town[100];
        towns[0] = new Town("Tralee", "Kerry", 23000);
        towns[1] = new Town("Macroom", "Cork", 3800);
        towns[2] = new Town("Listowel", "Kerry", 4820);
        towns[3] = new Town("Adare", "Limerick", 2650);
        towns[4] = new Town("Killarney", "Kerry", 14500);
        int currentSize = 5;

        displayArray(towns, currentSize);

        Arrays.sort(towns, 0, 5);
        System.out.println("\nSorted List");
        displayArray(towns, currentSize);

        ArrayList<Town> towns1 = new ArrayList<Town>();

        towns1.add(new Town("Tralee", "Kerry", 23000));
        towns1.add(new Town("Macroom", "Cork", 3800));
        towns1.add(new Town("Listowel", "Kerry", 4820));
        towns1.add(new Town("Adare", "Limerick", 2650));
        towns1.add(new Town("Killarney", "Kerry", 14500));

        System.out.println("\nArrayList");
        displayArrayList(towns1);

        Collections.sort(towns1);
        System.out.println("\nSorted ArrayList");
        displayArrayList(towns1);
    }

    private static void displayArray(Town[] towns, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(towns[i]);
        }
    }

    private static void displayArrayList(ArrayList<Town> towns1) {
        for (Town t : towns1) {
            System.out.println(t);
        }
    }
}