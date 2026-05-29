package io.rickarya.collections;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");
        
        System.out.println("Hashtable: " + table);
        System.out.println("Get 1: " + table.get(1));
        System.out.println("Contains key 2: " + table.containsKey(2));
    }
}
