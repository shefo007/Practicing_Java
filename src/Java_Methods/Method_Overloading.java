package Java_Methods;

public class Method_Overloading {
    public static void main(String[] args) {

        int a = 10;
        int b = 24;
        double c = 12.5;
        double d = 16.4;
        min_function(a, b);
        min_function(c, d);

    }

    public static void min_function(int x, int y) {

        int min;
        if (x > y)
            min = y;
        else
            min = x;

        System.out.println("Minimum value for integer is :" + min);
    }

    public static void min_function(double m, double n) {

        double min;
        if (m > n)
            min = n;
        else
            min = m;
        System.out.println("Minimum value for integer is :" + min);
    }
}
