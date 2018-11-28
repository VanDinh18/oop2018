package week12;

public class Task1 {
    public static void main(String[] args) {
        Component C11 = new Leaf("con1 cua c1", 10, "nam", false);
        Component C12 = new Leaf("con2 cua c1", 18, "nu", false);
        Component C1 = new Composite("con cua b1, bo cua c11 c12", 30, "nam", true);
        C1.addChild(C11);
        C1.addChild(C12);


        Component C2 = new Composite("con cua b1, không có con, có vợ", 32, "nu", true);


        Component C3 = new Composite("con cua b1, không có con, không vợ", 38, "nam", false);

        Component B1 = new Composite("bo", 50, "nam", true);

        B1.addChild(C1);
        B1.addChild(C2);
        B1.addChild(C3);

        B1.print();
    }
}
