package Java_HashSet;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW"); // not unique
        cars.add("Ford");
        //cars.add("BMW"); // not unique
        cars.add("Mazda");

        System.out.println(cars);

        // Access an Item
        System.out.println(cars.contains("BMW"));

        // Remove an Item
        cars.remove("Mazda");

        // Remove all items
        //cars.clear();

        // HashSet size
        int hashSetSize = cars.size();
        System.out.println(hashSetSize);

        // Loop through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }

        }
    }
}
