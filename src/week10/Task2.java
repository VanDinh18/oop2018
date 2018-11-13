package week10;

import java.util.Random;

public class Task2 {
    public static void bubbleSort(float array[]){
        boolean isBoolean = true;
        float temp;

        for(int i=0; i<1000; i++){
            isBoolean = true;
            for(int j=1; j<1000-i; j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isBoolean = false;
                }
            }
            if(isBoolean)
                break;
        }

        for(int i=0; i<1000; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        float []array = new float[1000];
        Random rd = new Random();
        for(int i=0; i<1000; i++){
            float number = (float) rd.nextInt(1000)+ (float) rd.nextFloat();
            array[i] = number;
        }
        
        bubbleSort(array);
    }
}
