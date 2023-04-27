package Java_Interface;

public class Main {

    public static void main(String[] args) {
        Sheep mySheep = new Sheep();

        mySheep.animalSound();
        mySheep.sleep();

        DemoClass myDemo = new DemoClass();

        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}
