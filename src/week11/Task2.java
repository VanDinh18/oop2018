package week11;

import java.util.ArrayList;
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
    public static  <T extends Comparable> T _maxArray(ArrayList a){
        T max = (T) a.get(0);
        for(int i=0; i<a.size(); i++){
            if(max.compareTo(a.get(i)) < 0){
                max = (T)a.get(i);
            }
        }
        return max;
    }
    public static  void main(String[] args) {
        Integer [] a = {1, 9, 4, 5};
        Integer i = maxArray(a);
        Character [] a_ = {'a', 'd', 'c', 'b'};
        Character c = maxArray(a_);
        //System.out.println(i + " " + c);


        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(6);

        Integer maxI = _maxArray(arrayList);
        System.out.println(maxI);
    }

}
