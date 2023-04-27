package Java_OOP.Java_Encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {

        //creating instance of the encapsulated class
        EncapsulationDemo obj = new EncapsulationDemo();

        //setting value in the age member
        obj.setAge(25);

        //setting value in the name member
        obj.setName("Terry");

        //getting value of the age and name member
        System.out.print("Name : " + obj.getName() + " and Age : " + obj.getAge());

    }
}
