
import java.text.SimpleDateFormat;
import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        searchPeople();
    }

    public static void searchPeople() {
        ArrayList<Person> people = new ArrayList<>();

        String dobOneText = "03/01/1990";
        String dobTwoText = "04/07/1987";
        String dobThreeText = "25/01/1991";
        String dobFourText = "14/02/1986";
        String dobFiveText = "18/06/1984";

        SimpleDateFormat mySimpleDateFormatter = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date dateOne = mySimpleDateFormatter.parse(dobOneText);
            Date dateTwo = mySimpleDateFormatter.parse(dobTwoText);
            Date dateThree = mySimpleDateFormatter.parse(dobThreeText);
            Date dateFour = mySimpleDateFormatter.parse(dobFourText);
            Date dateFive = mySimpleDateFormatter.parse(dobFiveText);

            Person personOne = new Person("Dave", "O'Sullivan", dateOne);
            Person personTwo = new Person("Maire", "Deane", dateTwo);
            Person personThree = new Person("Paul", "O'Sullivan", dateThree);
            Person personFour = new Person("Claire", "Deane", dateFour);
            Person personFive = new Person("Paul", "O'Sullivan", dateFive);

            people.add(personOne);
            people.add(personTwo);
            people.add(personThree);
            people.add(personFour);
            people.add(personFive);
        } catch(Exception e) {
            System.out.println("There was an error man! check your code!");
        }

        if(people.size() < 1) {
            System.out.println("Couldnt Populate ArrayList");
            System.exit(0);
        }

        System.out.println("Populated ArrayList! Congrats dude, you earned a coffee!");

        System.out.println("Before Sort :");

        for(Person p : people)
            System.out.print(p.toString());

        Collections.sort(people);

        System.out.println("\n\nAfter Sort by first name:");
        for(Person p : people)
            System.out.print(p.toString());

        System.out.println("\n\nSearching For Dave...");

        Person[] peopleArray = new Person[5];

        int index = 0;

        for(Person p : people) {
            peopleArray[index] = p;
            index ++;
        }
        Comparator<Person> personComparator = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getForename().compareTo(o2.getForename());
            }
        };

        int lookForDave = Collections.binarySearch(people, new Person("Dave", null, null), personComparator);

        if(lookForDave == 1)
            System.out.println("\nDave Found");
        else
            System.out.println("\nDave not Found");

        int lookForMaire = Collections.binarySearch(people, new Person("Maire", null, null), personComparator);

        System.out.println("\nSearching for Maire...");

        if(lookForMaire == 2)
            System.out.println("\nFound Maire!");
        else
            System.out.println("\nNo sign of Maire");

        int lookForDavid = Collections.binarySearch(people, new Person("David", null, null), personComparator);

        System.out.println("\n\nLooking for David...");

        if(lookForDavid < 0)
            System.out.println("\nNo sign of a David");
        else
            System.out.println("\nFor some reason we found a David");

        System.out.println("\nThere are two pauls at positions 3 and 4...");

        int lookForPaul = Collections.binarySearch(people, new Person("Paul", null, null), personComparator);

        System.out.println("\nThe first Paul found was at position " + lookForPaul);
    }

}
