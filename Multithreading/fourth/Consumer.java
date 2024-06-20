package AdvancedJava.Multithreading.fourth;

//Exercise 2.4.a
public class Consumer implements Runnable {
    private final Four four;

    public Consumer(Four four) {
        this.four = four;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int value = four.consume();
                System.out.println("Consumed: " + value);
                Thread.sleep(150); // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
