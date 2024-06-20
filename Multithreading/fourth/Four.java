package AdvancedJava.Multithreading.fourth;

import java.util.LinkedList;
import java.util.Queue;

//Exercise 2.4.a
public class Four {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public Four(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.offer(value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        notifyAll();
        return value;
    }
}
