package AdvancedJava.Generics;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create a generic method that takes two lists of the same type
// and merges them into a single list. This method alternates the elements of each list.

//Assuming both lists are of the same type
public class five {
    public static List<Object> interleave(List<?> list1, List<?> list2){
        List<Object> result = new ArrayList<Object>();
        if(list1.size() <= list2.size()){
            for(int i = 0; i < list1.size(); i++){
                result.add(list1.get(i));
                result.add(list2.get(i));
            }
            for(int j = list1.size(); j < list2.size(); j++){
                result.add(list2.get(j));
            }
        }
        else{
            for (int i = 0; i < list2.size(); i++) {
                result.add(list1.get(i));
                result.add(list2.get(i));
            }
            for (int j = list2.size(); j < list1.size(); j++) {
                result.add(list1.get(j));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list1.add("CAR");
        list1.add("Bank");
        list1.add("Hen");

        list2.add("Zoo");

        List<Object> res = new ArrayList<Object>();
        res = five.interleave(list1, list2);

        for(Object o : res){
            System.out.println(o);
        }
    }
}
