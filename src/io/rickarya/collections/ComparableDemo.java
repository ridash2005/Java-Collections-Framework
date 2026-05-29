package io.rickarya.collections;

import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
        
        List<String> words = Arrays.asList("zebra", "apple", "mango");
        Collections.sort(words);
        System.out.println("Sorted words: " + words);
    }
}
