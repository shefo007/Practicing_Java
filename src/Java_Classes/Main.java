package Java_Classes;

import Polymorphism.Animal;
import Polymorphism.Dog;
import Polymorphism.Pig;

public class Main {

    final double PI = 3.14;

    int x;

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

//    public Main1() {
//        this.x = 5;
//    }

    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
//        Main1 myObj = new Main1(5);
//        myObj.x = 10;
        //myObj.PI = 5; //java: cannot assign a value to final variable PI

//        myStaticMethod();
//        myObj.myPublicMethod();
//        System.out.println(myObj.PI);

        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
