package AdvancedJava.Multithreading.fourth;

public class Producer implements Runnable {
    private final Four four;

    public Producer(Four four) {
        this.four = four;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                four.produce(i);
                System.out.println("Produced: " + i);
                Thread.sleep(100); // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
