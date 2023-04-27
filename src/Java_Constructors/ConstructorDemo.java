package Java_Constructors;

public class ConstructorDemo {

    int x;

    //Create a Constructor for class ConstructorDemo
    ConstructorDemo()
    {
        x=24;
    }
    public static void main(String[] args) {

        //Create an object of class Constructor and will call the constructor
        ConstructorDemo demo = new ConstructorDemo();
        System.out.println("Value of x: " + demo.x);
    }
}
