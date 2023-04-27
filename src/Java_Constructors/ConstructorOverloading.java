package Java_Constructors;

public class ConstructorOverloading {

    String Name;
    int RollNo;
    int Age;

    //Constructor 1
    ConstructorOverloading(String New_Name, int New_RollNo, int New_Age) {

        Name = New_Name;
        RollNo = New_RollNo;
        Age = New_Age;
    }

    //Constructor 2
    ConstructorOverloading(int R, int A) {

        RollNo = R;
        Age = A;
    }

    //Constructor 3
    ConstructorOverloading(String SName, int SRollNo) {

        Name = SName;
        RollNo = SRollNo;
    }

    void DisplayInformation() {

        System.out.println("name: " + Name + ", " + "Roll_No: " + RollNo + "," + "Age: " + Age);
    }

    public static void main(String[] args) {
        ConstructorOverloading stud1 = new ConstructorOverloading("TOM", 001, 20);
        ConstructorOverloading stud2 = new ConstructorOverloading(002, 21);
        ConstructorOverloading stud3 = new ConstructorOverloading("MIKE", 003);
        stud1.DisplayInformation();
        stud2.DisplayInformation();
        stud3.DisplayInformation();
    }
}
