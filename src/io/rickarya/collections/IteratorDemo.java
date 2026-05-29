package io.rickarya.collections;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\nUsing for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
