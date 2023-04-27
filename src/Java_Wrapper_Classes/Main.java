package Java_Wrapper_Classes;

public class Main {

    public static void main(String[] args) {
        Integer myInt = 500;
        Double myDouble = 5.99;
        Character myChar = 'S';

        System.out.println(myInt);       // 500
        System.out.println(myDouble);   //  5.99
        System.out.println(myChar);    //   S

        System.out.println(myInt.intValue());          // 500
        System.out.println(myDouble.doubleValue());   //  5.99
        System.out.println(myChar.charValue());      //   S

        String myString = myInt.toString();
        System.out.println(myString.length()); // 3
    }
}
