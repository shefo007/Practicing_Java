package Strings_Manipulation;

public class String_Demo {

    public static void main(String[] args) {

        //creating string by java string literal
        String str1 = "learn";
        char[] message = {'b','a','s','i','c'};

        //creating string by new keyword
        String str2 = new String(message);
        String str3 = new String("java");
        String str4 = str1 + " " + str2 + " " + str3;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        // Length
        System.out.println(); // To make output good
        int str4_length = str4.length();
        System.out.println("Length of String is : " + str4_length);

        // Concatenation using + operator
        System.out.println();
        String message_1 = "Learn Basic Java";
        String message_2 = "and Learn Selenium";
        String Concat_message = message_1 + " " + message_2;
        System.out.println("Concatenation Result is : " + Concat_message);

        // Concatenation using concat method
        System.out.println();
        String concatNewMessage = message_1.concat(" " + message_2);
        System.out.println("Using concatenation method: " + concatNewMessage);

        // equals method
        System.out.println();
        String s1 = "learn";
        String s2 = "learn";
        String s3 = "LEARN";
        boolean c1 = s1.equals(s2);
        boolean c2 = s1.equals(s3);
        System.out.println(c1);
        System.out.println(c2);

        // equalsIgnoreCase() method
        System.out.println();
        String message_3 = "selenium";
        String message_4 = "SELENIUM";
        boolean comp_ignore_case = message_3.equalsIgnoreCase(message_4);
        System.out.println("The result of String Comparison after ignoring case difference is : " + comp_ignore_case);

        // CharAt() method
        System.out.println();
        char charIndex = message_3.charAt(5);
        System.out.println("The fifth character is: " + charIndex);

        // toLowerCase() method
        System.out.println();
        String lowerCaseMessage_4 = message_4.toLowerCase();
        System.out.println("The message in lower case: " + lowerCaseMessage_4);

        // toUpperCase() method
        System.out.println();
        String upperCaseMessage_3 = message_3.toUpperCase();
        System.out.println("The message in upper case: " + upperCaseMessage_3);

        // trim() method
        System.out.println();
        String message_5 = " lion ";
        System.out.println("Length of message with trim: " + message_5.trim().length());
        System.out.println("Length of message without trim: " + message_5.length());

        // replace() method
        System.out.println();
        System.out.println(str1.replace('e','E'));

        // split() method
        System.out.println();
        String[] aSplit = message_1.split("Basic");
        System.out.println(aSplit.length);
        System.out.println("The first part of the array is : " + aSplit[0]);
        System.out.println("The last part of the array is : " + aSplit[1]);

        // startWith() method
        System.out.println();
        System.out.println("Result is " + str1.startsWith("le"));

        // indexOf(String str)
        System.out.println();
        int java_index = message_1.indexOf("Java");
        System.out.println("The start index is : " + java_index);

        // substring()
        System.out.println();
        String subString = message_1.substring(2, 9);
        System.out.println(subString);

        // contains(CharSequence s)
        System.out.println();
        boolean containsExample = message_1.contains("Basic");
        System.out.println("The string contains Basic : " + containsExample);


    }
}
