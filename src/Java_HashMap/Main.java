package Java_HashMap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");

        System.out.println(capitalCities);

        // Access an Item
        System.out.println(capitalCities.get("Germany"));

        // Remove an Item
        capitalCities.remove("Norway");

        // Remove all items
        //capitalCities.clear();

        // HashMap size
        int hashMapSize = capitalCities.size();
        System.out.println(hashMapSize);

        // Loop through a HashMap
        for (String k : capitalCities.keySet()) {
            // keySet() to print keys
            System.out.println(k);
        }

        for (String v: capitalCities.values()) {
            // values() to print values
            System.out.println(v);
        }

        for (String i : capitalCities.keySet()) {
            // print key and value
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }

        /* Create hashMap to store Strings as keys and Integers as values */
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String k: people.keySet()) {
            System.out.println("Name: " + k + " Age: " + people.get(k));
        }

    }
}
