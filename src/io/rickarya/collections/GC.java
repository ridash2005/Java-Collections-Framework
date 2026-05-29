package io.rickarya.collections;

import java.util.*;

public class GC {
    public static void main(String[] args) {
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() + " bytes");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() + " bytes");
        
        // Create objects and force GC
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new byte[1024 * 1024]); // 1MB each
        }
        
        System.out.println("Before clear - Free memory: " + Runtime.getRuntime().freeMemory() + " bytes");
        
        list.clear();
        System.gc();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("After GC - Free memory: " + Runtime.getRuntime().freeMemory() + " bytes");
    }
}
