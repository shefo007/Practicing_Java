package Java_OOP.Java_Polymorphism.Static_Poly;

import Java_OOP.Java_Polymorphism.Static_Poly.Calculation;

public class PolymorphismTest {

    public static void main(String[] args) {

        Calculation cal = new Calculation();
        cal.sum(10, 5);
        cal.sum(2, 6, 4);

    }
}
