package AdvancedJava.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Write a Java program to create a generic method that takes a list of any type and a predicate. 
//It returns an array list containing only elements that satisfy the predicate.
public class six {
    public static <T> List<T> satisfiedCount(List<T> l, Predicate<T> pred){
        List<T> ret = new ArrayList<T>();
        for(T el : l){
            if(pred.test(el)){
                ret.add(el);
            }

        }
        return ret;
    }
    public static void main(String[] args){
        Predicate<String> isHello = s -> ((s.toLowerCase().equals("hello")));

        List<String> l = new ArrayList<String>();
        l.add("heLlo");
        l.add("HELL0!");
        l.add("hello");
        l.add("Hello!");
        l.add("HELLO");
        List<String> ans = new ArrayList<String>();

        ans = satisfiedCount(l, isHello);
        System.out.println("Printing List");
        for(String s: ans){
            System.out.println(s);
        }
    }
    
}
