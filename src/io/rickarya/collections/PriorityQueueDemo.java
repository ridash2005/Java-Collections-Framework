package io.rickarya.collections;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("PriorityQueue: " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println("Poll: " + pq.poll());
        }
    }
}
