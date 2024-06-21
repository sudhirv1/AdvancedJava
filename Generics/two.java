package AdvancedJava.Generics;
//2. Write a Java program to create a generic method that takes 
//   a list of numbers and returns the sum of all the even and odd numbers.

import java.util.ArrayList;
import java.util.List;

public class two<T> {

    public static<T extends Number> void printTotals(List<Number> numbers){
        int evenTotal = 0, oddTotal = 0;
        for(Number number : numbers){
            if(number.intValue() % 2 == 0){
                evenTotal += number.intValue();
            }
            else{
                oddTotal += number.intValue();
            }
        }
        System.out.println("Even total: " + evenTotal + " | Odd total: " + oddTotal);
    }

    public static void main(String[] args) {
        List<Number> l = new ArrayList<Number>(); 
        l.add(1);
        l.add(2.0);
        l.add(3);
        l.add(8/2);
        two.printTotals(l);
    }
}
