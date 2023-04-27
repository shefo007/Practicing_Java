package Java_Enums;

public class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        //System.out.println(myVar);

        switch (myVar) {
            case LOW -> System.out.println("Low level");
            case MEDIUM -> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
        }

        for (Level lvl : Level.values()) {
            System.out.println(lvl);
        }
    }

}
