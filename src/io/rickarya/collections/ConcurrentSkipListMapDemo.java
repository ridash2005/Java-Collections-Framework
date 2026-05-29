package io.rickarya.collections;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("ConcurrentSkipListMap: " + map);
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());
    }
}
