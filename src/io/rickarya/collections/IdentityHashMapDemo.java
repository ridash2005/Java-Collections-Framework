package io.rickarya.collections;

import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        
        String key1 = new String("key");
        String key2 = new String("key");
        
        map.put(key1, 1);
        map.put(key2, 2);
        
        System.out.println("IdentityHashMap size: " + map.size());
        System.out.println("key1.equals(key2): " + key1.equals(key2));
        System.out.println("key1 == key2: " + (key1 == key2));
    }
}
