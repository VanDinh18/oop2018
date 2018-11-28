package week12;

public class OptionSort implements SortBehavior {
    @Override
    public void sort(){
        SortArray sortArray = new SortArray();
        int [] a = sortArray.getArray();
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
