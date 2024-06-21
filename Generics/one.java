package AdvancedJava.Generics;
//1. Write a Java program to create a generic method that takes 
//   two arrays of the same type and checks if they have the same elements in the same order.
public class one{
    public static <T> boolean checkEqual(T[] t1, T[] t2) {
        if(t1.length != t2.length) return false;
        for(int i = 0; i < t1.length; i++){
            if(t1[i] != t2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Number[] a = {1, 2, 3};
        Number[] b = {1, 2, 8};
        String result = one.checkEqual(a, b) ? "have" : "don't have";
        System.out.println("A abd B " + result + " the same elements in the same order");
    }
}
