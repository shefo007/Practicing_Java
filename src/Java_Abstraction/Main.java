package Java_Abstraction;

public class Main {
    public static void main(String[] args) {
        Sheep mySheep = new Sheep();
        Dog myDog = new Dog();

        mySheep.sleep();
        mySheep.animalSound();

        myDog.animalSound();
        myDog.sleep();

    }
}
