package week11;

import java.util.Arrays;
import java.util.Iterator;


public class Task2 {
    public static  <T extends Comparable> T maxArray(T[] a){
        T max = a[0];
        for(T s : a){
            if(s.compareTo(max) > 0){
                max = s;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer [] a = {1, 9, 4, 5};
        Integer i = maxArray(a);
        Character [] a_ = {'a', 'd', 'c', 'b'};
        Character c = maxArray(a_);
        System.out.println(i + " " + c);
    }
}
