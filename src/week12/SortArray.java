package week12;

public class SortArray {
    SortBehavior BubbleSortBehavior;
    SortBehavior OptionSortBehavior;

    private int[] array = {1, 3, 2, 10, 5, 7, 4};

    public int[] getArray(){
        return this.array;
    }

    //public abstract void print();

    public void performBubbleSort(){
        BubbleSortBehavior.sort();
    }

    public void performOptionSort(){
        OptionSortBehavior.sort();
    }


}
