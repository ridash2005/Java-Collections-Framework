package io.rickarya.collections;

import java.util.*;

public class HashCodeAndEqualsMethod {
    static class Person {
        String name;
        int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Person)) return false;
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        
        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
    
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Alice", 25)); // Duplicate
        
        System.out.println("People set size: " + people.size());
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
