package Java_OOP.JavaClassObject;

public class Student_Test {

    public static void main(String[] args)
    {
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.InsertData("Tom", 34);
        stud1.DisplayData();

        stud2.InsertData("Terry", 36);
        stud2.DisplayData();
    }
}
