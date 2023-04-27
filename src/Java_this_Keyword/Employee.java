package Java_this_Keyword;

public class Employee {

    String name;
    String EmpId;
    int age;

//    Employee(String name, String EmpId) {
//        name = name;
//        EmpId = EmpId;
//    }

    // output with this constructor without using "this" keyword is null


    public Employee(String name, String EmpId) {
        this.name = name;
        this.EmpId = EmpId;
    }

    public Employee(int age) {
        this("Ahmed", "4654df");
        this.age = age;
    }



    void display() {
        System.out.println(name + " " + EmpId);
        System.out.println(age);
    }


    public static void main(String[] args) {
        Employee E1 = new Employee("Ali", "IT0047");
        Employee E2 = new Employee("Hassan", "IT0045");
        Employee E3 = new Employee(25);
        E1.display();
        E2.display();
        E3.display();
    }


}
