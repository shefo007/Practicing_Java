package Java_Exception_Handling;

public class StringOutOfBoundDemo {

    public static void main(String[] args) {
        {
            try {
                String a = "This is testing"; // length is 15
                System.out.println("Length of String :" + a.length());

                char b = a.charAt(20); // accessing 20th element
                System.out.println(b);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndexOutOfBoundsException");
            }
        }
    }
}
