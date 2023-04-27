package Java_Exception_Handling;

public class NumberFormatDemo {

    public static void main(String[] args) {
        try {
            // "java" is not a number
            int num = Integer.parseInt("java");

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
