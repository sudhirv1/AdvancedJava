package AdvancedJava.Generics;
//Write a Java program to create a generic method that takes a list 
//of any type and returns it as a new list with the elements in reverse order.
import java.util.ArrayList;
import java.util.List;

public class four {
    public static List<Object> flip(List<Object> items){
        List<Object> ret = new ArrayList<Object>();
        for (int i = items.size()-1; i >= 0 ; i--) {
            ret.add(items.get(i));
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Object> l = new ArrayList<>(); 
        l.add(1);
        l.add(2.0);
        l.add('A');
        l.add(3);
        l.add("CAR");
        l.add(8 / 2);
        List<Object> ret = new ArrayList<Object>();
        ret = four.flip(l);
        for (int i = 0; i < ret.size(); i++) {
            System.out.println(ret.get(i));
        }
    }
}
