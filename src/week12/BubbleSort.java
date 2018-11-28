package week12;

public class BubbleSort implements SortBehavior{
    @Override
    public void sort() {
        SortArray sortArray = new SortArray();
        int [] a = sortArray.getArray();
        int n = a.length;

        boolean isBoolean = true;
        int temp;

        for(int i=0; i<n; i++){
            isBoolean = true;
            for(int j=1; j<n-i; j++){
                if(a[j-1] > a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    isBoolean = false;
                }
            }
            if(isBoolean)
                break;
        }

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
