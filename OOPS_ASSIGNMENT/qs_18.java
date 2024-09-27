package OOPS_ASSIGNMENT;

//Write a java program to solve a producer consumer problem where the producer will
//produce a string and consumer will consume that string to make that string null string.

import java.util.LinkedList;
import java.util.Queue;

// Shared resource
class SharedResource {
    private String message;
    private boolean isAvailable = false; // To check if message is available

    public synchronized void produce(String msg) {
        // Wait until the message is consumed
        while (isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Produce the message
        this.message = msg;
        System.out.println("Produced: " + message);
        isAvailable = true;
        notify(); // Notify the consumer that the message is available
    }

    public synchronized void consume() {
        // Wait until the message is produced
        while (!isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Consume the message
        System.out.println("Consumed: " + message);
        message = null; // Making the string null
        isAvailable = false;
        notify(); // Notify the producer that the message has been consumed
    }
}

// Producer class
class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "World", "Producer-Consumer", "Java", "Synchronization"};
        for (String msg : messages) {
            sharedResource.produce(msg);
            try {
                Thread.sleep(1000); // Simulating time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.consume();
            try {
                Thread.sleep(1500); // Simulating time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main class
public class qs_18 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

