package io.rickarya.collections;

import java.util.*;

public class EnumMapDemo {
    enum Color { RED, GREEN, BLUE }
    
    public static void main(String[] args) {
        EnumMap<Color, String> map = new EnumMap<>(Color.class);
        map.put(Color.RED, "#FF0000");
        map.put(Color.GREEN, "#00FF00");
        map.put(Color.BLUE, "#0000FF");
        
        System.out.println("EnumMap: " + map);
        for (Color color : Color.values()) {
            System.out.println(color + " -> " + map.get(color));
        }
    }
}
