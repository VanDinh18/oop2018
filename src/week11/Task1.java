package week11;

import java.util.Arrays;

public class Task1 {
    public static <T> void printArray(T[] inputArray){
        Arrays.sort(inputArray);
        for(T s : inputArray){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        Integer[] int_ = {1, 4, 5, 2, 9, 0};
        printArray(int_);

        String [] char_ = {"a", "d", "k", "e", "c", "b"};
        printArray(char_);
    }
}
