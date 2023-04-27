package Java_Interface;

public class Sheep implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The Sheep says: maa maa");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
