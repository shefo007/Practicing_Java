package Java_OOP.Java_Abstraction;

public class BikeTest {

    public static void main(String[] args) {

        Bike bike = new Trek();
        bike.run();
        bike.change_gear();

        System.out.println("Value of x :" + bike.x);

    }
}
