package Java_Lambda_expression;

public class LambdaThreadDemo {
    public static void main(String[] args) {

        // Implementing Runnable using old way
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Old Thread name: " + Thread.currentThread().getName());
            }
        };

        Thread thread1 = new Thread(runnable1);

        // Implementing Runnable using Lambda Expression
        Runnable runnable2 = () -> {
            System.out.println("New Thread name : " + Thread.currentThread().getName());
        };

        Thread thread2 = new Thread(runnable2);

        // Start Threads
        thread1.start();
        thread2.start();

    }
}
