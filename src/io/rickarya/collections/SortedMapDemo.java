package io.rickarya.collections;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(5, "Five");
        
        System.out.println("SortedMap: " + map);
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Head map (< 4): " + map.headMap(4));
        System.out.println("Tail map (>= 3): " + map.tailMap(3));
    }
}
