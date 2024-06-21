package AdvancedJava.Generics;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create a generic method that takes a list of any type and a target element. 
// It returns the index of the first occurrence of the target element in the list. 
// Return -1 if the target element cannot be found.
public class three {

    public static Object seekTarget(List<Object> items, Object target){
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Object> l = new ArrayList<>(); 
        l.add(1);
        l.add(2.0);
        l.add('A');
        l.add(3);
        l.add("CAR");
        l.add(8 / 2);
        System.out.println(three.seekTarget(l, "CCCHHH"));
    }
}
