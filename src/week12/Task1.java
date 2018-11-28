package week12;

public class Task1 {
    public static void main(String[] args) {
        Component C1 = new Leaf("con1", 30, "nam");
        Component C2 = new Leaf("con2", 28, "nu");
        Component B = new Composite("bo", 50, "nam");
        Component M = new Leaf("vo", 48, "nu");
        B.addChild(C1);
        B.addChild(C2);
        B.addMarried(M);
        B.print();

        Component C11 = new Leaf("con11", 10, "nam");
        Component C12 = new Leaf("con12", 12, "nam");
        Component C13 = new Leaf("con13", 15, "nam");
        Component VC1 = new Leaf("vo cua c1", 27, "nu");
        C1.addChild(C11);
        C1.addChild(C12);
        C1.addChild(C13);
        C1.addMarried(VC1);
        C1.print();
    }
}
