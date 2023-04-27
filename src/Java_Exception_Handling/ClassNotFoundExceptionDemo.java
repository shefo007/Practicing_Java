package Java_Exception_Handling;

public class ClassNotFoundExceptionDemo {

    public static void main(String[] args) {
        try {
            Class temp = Class.forName("gfg");
            // Calling the clas gfg which is not present in the
            // current class temp instance of calling class it
            // will throw ClassNotFoundException;
        } catch (ClassNotFoundException e) {
            // block executes when mention exception occur
            System.out.println("Class does not exist check the name of the class");
        }
    }
}
