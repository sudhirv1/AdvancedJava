package AdvancedJava.Generics;

import java.util.HashMap;
import java.util.Map;

// Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.
public class seven {
    public static <T, U> void printMap(Map<T, U> cache){
        for(T t: cache.keySet()){
            System.out.println("Key: " + t + " | Value: " + cache.get(t));
        }
    }
    public static void main(String[] args){
        Map<String, Integer> cache = new HashMap<>();
        cache.put("John", 96193);
        cache.put("Tim", 45673);
        cache.put("Dale", 78832);
        cache.put("Reggie", 21569);
        seven.printMap(cache);
    }
}
