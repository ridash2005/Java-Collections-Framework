package io.rickarya.collections;

import java.util.*;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Stream with filter and map
        List<Integer> squared = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .toList();
        
        System.out.println("Squared even numbers: " + squared);
        
        // forEach with lambda
        System.out.println("All numbers:");
        numbers.forEach(n -> System.out.println(n));
        
        // Comparator with lambda
        Collections.sort(numbers, (a, b) -> b - a);
        System.out.println("Sorted descending: " + numbers);
    }
}
