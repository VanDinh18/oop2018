package week12;

public class Task1 {
    public static void main(String[] args) {
        Component A1 = new Leaf("a1", 30, "nam");
        Component A2 = new Leaf("a2", 28, "nu");
        A1.addMarried(A2);
    }
}
