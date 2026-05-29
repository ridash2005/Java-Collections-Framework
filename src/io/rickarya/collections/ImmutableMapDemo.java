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
        
        // Java 9+: Using Map.of()
        Map<String, Integer> immutable = Map.of("X", 10, "Y", 20);
        System.out.println("Immutable Map (Java 9+): " + immutable);
    }
}
