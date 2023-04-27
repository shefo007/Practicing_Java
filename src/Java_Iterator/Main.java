package Java_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> car = cars.iterator();

        // Check if there is an item
        System.out.println(car.hasNext()); // true

        // Loop through arrayList
        while (car.hasNext()) {
            System.out.println(car.next());
            /*Output:
            * Volvo
            * BMW
            * Ford
            * Mazda */
        }

        // Remove item from a collection while looping through
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
                System.out.println(i); // 8, 2
            }
        }
    }
}
