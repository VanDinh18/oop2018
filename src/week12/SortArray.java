package week12;

public abstract class SortArray {
    SortBehavior sortBehavior;

    public static int[] array = {1, 3, 2, 10, 5, 7, 4};


    //public abstract void print();

    public void performSort(){
        sortBehavior.sort();
    }

    public SortBehavior getSortBehavior() {
        return sortBehavior;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
}
