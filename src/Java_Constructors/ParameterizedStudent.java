package Java_Constructors;

public class ParameterizedStudent {

    String name;
    int rollNo;

    ParameterizedStudent(String New_Name, int New_RollNo) {
        name = New_Name;
        rollNo = New_RollNo;
    }

    void DisplayInformation()
    {
        System.out.println("name: " + name + ", " + "Roll_No: " + rollNo);
    }

    public static void main(String[] args) {

        ParameterizedStudent stud1 = new ParameterizedStudent("TOM", 001);
        ParameterizedStudent stud2 = new ParameterizedStudent("MIKE", 002);
        stud1.DisplayInformation();
        stud2.DisplayInformation();
    }
}
