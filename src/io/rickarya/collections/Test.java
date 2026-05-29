package io.rickarya.collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Java Collections Framework - Test Class");
        
        // Test ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        System.out.println("ArrayList: " + arrayList);
        
        // Test HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("HashMap: " + map);
        
        // Test HashSet
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        System.out.println("HashSet: " + set);
        
        System.out.println("All tests passed!");
    }
}
