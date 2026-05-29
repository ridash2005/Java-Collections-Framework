package io.rickarya.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("CopyOnWriteArrayList: " + list);
        
        for (String fruit : list) {
            System.out.println(fruit);
            if (fruit.equals("Banana")) {
                list.add("Date");
            }
        }
        
        System.out.println("Final list: " + list);
    }
}
