package week11;

import java.util.Arrays;


public class Task1 {
    public static <T extends Comparable> void sortArray(T[] a){
        //Arrays.sort(a);
        int n = a.length;
        boolean b = true;
        while (b)
        {
            b = false;
            for (int i = 0; i < n - 1; i++)
            {
                if (a[i].compareTo(a[i + 1]) > 0)
                {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    b = true;
                }
            }
        }
        for(T s : a){
            System.out.println(s);
        }

    }


    public static void main(String[] args) {
        Integer[] int_ = {1, 4, 5, 2, 9, 0};
        sortArray(int_);

        String [] string_ = {"a", "d", "k", "e", "c", "b"};
        sortArray(string_);
    }
}
