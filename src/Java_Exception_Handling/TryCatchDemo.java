package Java_Exception_Handling;

public class TryCatchDemo {

    public static void main(String[] args) {
        {
            try {
                String a = null; // null value
                System.out.println(a.length());

                // This will never execute as try block has exception just above this statement
                System.out.println("Inside try block");

                // Exception will be handled in catch block and will execute the statements in
                // catch block
            } catch (NullPointerException e) {
                System.out.println("NullPointer Exception - Exception caught in Catch block");

            }

            // Rest of the program will be executed
            System.out.println("Outside try-catch block");
        }
    }
}
