package Java_OOP.Java_Polymorphism.Dynamic_Poly;

class BofA extends Bank {

    // Overriding method
    public void getRateOfInterest() {

        System.out.println("getRateOfInterest() method of child 2 class");
        System.out.println("Interest Rate of BofA Bank :" + 3.2);

    }
}
