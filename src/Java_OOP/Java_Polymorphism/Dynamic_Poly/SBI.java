package Java_OOP.Java_Polymorphism.Dynamic_Poly;

class SBI extends Bank {

    // Overriding method
    public void getRateOfInterest() {

        System.out.println("getRateOfInterest() method of child 3 class");
        System.out.println("Interest Rate of SBI Bank :" + 5.3);

    }
}
