package Java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class ArrayList_Example {
    public static void main(String[] args) {

        ArrayList<String> companies = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is companies list empty: " + companies.isEmpty());

        // Adding new elements to the ArrayList
        companies.add("Samsung");
        companies.add("Apple");
        companies.add("Motorola");
        companies.add("Google");
        companies.add("Sony");
        companies.add("Nokia");

        // print companies list
        System.out.println("Companies list is: "+companies);

        // Adding an element at a particular index in an ArrayList
        companies.add(2, "Microsoft");
        System.out.println("Updated companies list is: " + companies);

        System.out.println("Number of companies is: "+companies.size());

        System.out.println("First company in list is: "+companies.get(0));

        System.out.println("Last company in list is: " + companies.get(companies.size() - 1));

        // Remove the element
        companies.remove("Motorola");
        System.out.println(companies);

        // Remove the element at index '1'
        companies.remove(1);
        System.out.println("Updated Company List after removal is: " + companies);

        // Remove first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = companies.remove("Lenovo");
        System.out.println("Lenovo exists in Company List : " + isRemoved);


        // Remove all the elements that satisfy the given predicate
        Predicate<String> startWithM = company -> company.startsWith("M");
        companies.removeIf(startWithM);



        System.out.println("After Removing all elements that start with \"M\": " + companies);


        for (String company : companies) {
            System.out.println(company);
        }
        System.out.println("------------------------------");

        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i));
        }

        System.out.println("---------------------------------");

        Iterator<String> company = companies.iterator();

        while (company.hasNext()) {
            System.out.println(company.next());
        }
    }
}
