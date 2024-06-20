package AdvancedJava.Multithreading.fourth;

//Exercise 2.4.a
public class ProducerConsumer {
    public static void main(String[] args) {
        Four four = new Four(5); // Shared buffer with capacity 5

        Thread producerThread = new Thread(new Producer(four), "Producer");
        Thread consumerThread = new Thread(new Consumer(four), "Consumer");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
