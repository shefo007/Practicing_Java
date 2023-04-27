package Java_OOP.Java_Abstraction;

public abstract class Bike {

    int x = 25; // Instance Variable

    Bike() // Constructor
    {
        int y = 10;

        System.out.println("Value of y :" + y);
        System.out.println("Bike is created");

    }

    abstract void run(); // abstract method

    void change_gear() // non-Abstract method
    {
        System.out.println("Gear is changed");
    }
}
