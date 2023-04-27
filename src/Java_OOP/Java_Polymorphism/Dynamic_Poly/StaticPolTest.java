package Java_OOP.Java_Polymorphism.Dynamic_Poly;

public class StaticPolTest {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.getRateOfInterest();

        BOI bank2 = new BOI();
        bank2.getRateOfInterest();

        BofA bank3 = new BofA();
        bank3.getRateOfInterest();

        SBI bank4 = new SBI();
        bank4.getRateOfInterest();
    }
}
