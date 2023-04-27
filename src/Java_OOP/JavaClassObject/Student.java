package Java_OOP.JavaClassObject;

public class Student {
    String Name;
    int Age;

    void InsertData(String n, int a) {

        Name = n;
        Age = a;
    }

    void DisplayData() {

        System.out.println("Name of Student :" + Name);
        System.out.println("Age of Student :" + Age);
    }
}
