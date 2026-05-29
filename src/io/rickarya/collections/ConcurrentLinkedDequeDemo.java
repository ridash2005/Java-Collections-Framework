package io.rickarya.collections;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        
        System.out.println("ConcurrentLinkedDeque: " + deque);
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());
        
        deque.removeFirst();
        System.out.println("After removeFirst: " + deque);
    }
}
