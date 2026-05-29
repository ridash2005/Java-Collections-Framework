package io.rickarya.collections;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        Set<String> set = new CopyOnWriteArraySet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate
        
        System.out.println("CopyOnWriteArraySet: " + set);
        System.out.println("Size: " + set.size());
        
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
