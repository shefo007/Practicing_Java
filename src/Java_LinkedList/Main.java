package Java_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();


        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.addLast("Ferrari");
        cars.addFirst("Mercedes");


        cars.remove("BMW");
        cars.remove(2);

        // Removes all the elements from this list.
        //cars.clear();

        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.size());

        cars.set(0, "Audi");

        //Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
