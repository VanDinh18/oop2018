package week12;

public class Task2 {
    public static void main(String[] args) {
        SortArray a = new BubbleSortClass();
        a.performBubbleSort();
        SortArray b = new OptionSortClass();
        b.performOptionSort();
    }
}
