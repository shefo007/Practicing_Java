package EqualsMethodAndOperator;

public class EqualsDemo1 {

    public static void main(String[] args) {

        String str1 = new String("JAVA TUTORIAL");
        String str2 = new String("JAVA TUTORIAL");

        // Reference comparison
        System.out.println("Check str1 == str2 : " + (str1 == str2));

        // Content comparison
        System.out.println("Check str1.equals(str2) : " + str1.equals(str2));

        // integer-type
        System.out.println("Check Integer Type :" + (10 == 10));

        // char-type
        System.out.println("Check Char Type :" + ('a' == 'a'));
    }

}
