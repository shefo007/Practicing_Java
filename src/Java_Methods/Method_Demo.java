package Java_Methods;

public class Method_Demo {
    public static void main(String[] args) {

        //Standard Library Method
        System.out.println("Square root of 9 is : " + Math.sqrt(9));

        //User defined Method
        myMethod();

        //***************************************************
        // using user defined method
        int a = 10;
        int b=5;
        System.out.println("Minimum value is: "+ minNumberWithReturn(a,b));

        // Using built in method
        System.out.println("Minimum value is: " + Math.min(a,b));

        //******************************************************
        //using void
        minNumberWithVoid(a,b);




    }

    public static void minNumberWithVoid(int x, int y) {
        int min;

        if (x > y) {
            min = y;
        } else {
            min=x;
        }
        System.out.println("Minimum value is: " + min);
    }
    public static int minNumberWithReturn(int x, int y) {
        int min;

        if (x > y) {
            min = y;
        } else {
            min=x;
        }
        return min;
    }

    public static void myMethod() {
        System.out.println("My User defined Method");
    }
}
