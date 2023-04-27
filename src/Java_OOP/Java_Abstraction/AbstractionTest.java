package Java_OOP.Java_Abstraction;

public class AbstractionTest {

    public static void main(String[] args) {

        Bank bank1 = new SBI();
        bank1.getRateOfInterest();

        Bank bank2 = new BOI();
        bank2.getRateOfInterest();
    }
}
