package Java_static_Keyword;

public class Student {

    int RollNo;
    String Name;
    static String College = "FCI Luxor University"; // Static Variable

    Student(int num, String name) // Constructor
    {
        RollNo = num;
        Name = name;
    }

    // static method
    static void change() {
        College = "FCI Cairo university";
    }

    void DisplayInformation() {
        System.out.println("Roll_No: " + RollNo + ", Name: " + Name + ", College: " + College);
    }

    public static void main(String[] args) {
        // first student in luxor
        Student S1 = new Student(111, "Sherif Abdallah");
        S1.DisplayInformation();

        //second student in cairo
        change();
        Student S2 = new Student(222, "Ahmed Ali");

//        S1.DisplayInformation();
        S2.DisplayInformation();
    }
}
