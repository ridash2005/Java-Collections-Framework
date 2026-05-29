package io.rickarya.collections;

import java.util.*;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        
        Map<String, Integer> unmodifiable = Collections.unmodifiableMap(original);
        
        System.out.println("Unmodifiable Map: " + unmodifiable);
        
        try {
            unmodifiable.put("C", 3);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable map");
        }
        
        // Java 8 compatible: create an immutable-style map
        Map<String, Integer> temp = new HashMap<>();
        temp.put("X", 10);
        temp.put("Y", 20);
        Map<String, Integer> immutable = Collections.unmodifiableMap(temp);
        System.out.println("Immutable Map: " + immutable);
    }
}
