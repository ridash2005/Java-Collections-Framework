package io.rickarya.collections;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        
        new Thread(() -> {
            try {
                System.out.println("Producer: Putting item");
                queue.put("Hello");
                System.out.println("Producer: Item placed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
        
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Consumer: Taking item");
                String item = queue.take();
                System.out.println("Consumer: Got " + item);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
