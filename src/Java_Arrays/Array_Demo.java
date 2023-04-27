package Java_Arrays;

public class Array_Demo {
    public static void main(String[] args) {

        String[] Days = new String[7];
        Days[0] = "Monday";
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";
        Days[5] = "Saturday";
        Days[6] = "Sunday";

        // Another way
        String[] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        // Length of Array
        int len = days.length;

        //Access first element
        System.out.println("First element in Array: " + days[0]);
        System.out.println();

        // Last element
        System.out.println("Last element in Array: " + days[len - 1]);
        System.out.println();

        // print values
//        int i = 1;
//        for (String day : days) {
//
//            System.out.println("Value stored at position " + i +
//                    " is " + day);
//            i++;
//        }

        for (int i = 0; i < len; i++) {
            System.out.println("Value stored at position " + (i + 1) + " is " + days[i]);
        }

        System.out.println();

        // passing array as method
        printDays(Days);
        System.out.println();



    }

    public static void printDays(String[] array) {

        int len = array.length;

        for (int i = 0; i < len; i++) {
            System.out.println("Value stored at position " + (i + 1) + " is " + array[i]);
        }
    }
}
