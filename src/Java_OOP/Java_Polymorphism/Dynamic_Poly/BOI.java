package Java_OOP.Java_Polymorphism.Dynamic_Poly;

class BOI extends Bank {

    // Overriding method
    public void getRateOfInterest() {

        System.out.println("getRateOfInterest() method of child 1 class");
        System.out.println("Interest Rate of BOI Bank :" + 4.1);

    }
}
