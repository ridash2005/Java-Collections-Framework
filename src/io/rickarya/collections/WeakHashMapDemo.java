package io.rickarya.collections;

import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        
        String key = new String("temp");
        map.put(key, 100);
        
        System.out.println("Before GC: " + map.size());
        
        key = null;
        System.gc();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("After GC: " + map.size());
    }
}
