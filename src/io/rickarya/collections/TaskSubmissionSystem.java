package io.rickarya.collections;

import java.util.*;

public class TaskSubmissionSystem {
    static class Task implements Comparable<Task> {
        int priority;
        String name;
        
        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
        
        @Override
        public int compareTo(Task o) {
            return Integer.compare(o.priority, this.priority); // Higher priority first
        }
        
        @Override
        public String toString() {
            return name + " (Priority: " + priority + ")";
        }
    }
    
    public static void main(String[] args) {
        Queue<Task> taskQueue = new PriorityQueue<>();
        
        taskQueue.add(new Task(3, "Login"));
        taskQueue.add(new Task(1, "Shutdown"));
        taskQueue.add(new Task(2, "Process Data"));
        
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println("Executing: " + taskQueue.poll());
        }
    }
}
