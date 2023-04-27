package Java_Arrays;

public class Multidimensional_Array_Demo {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},
                {4,5,6,9},
                {7}};
        //print length of columns
        System.out.println("Length of Row 1 is :"+a[0].length);
        System.out.println("Length of Row 2 is :"+a[1].length);
        System.out.println("Length of Row 3 is :"+a[2].length);
        System.out.println("----------------------");
        //Print all elements of array
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }

    }
}
