package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression n1 = new Numeral(3); //3
        Expression s1 = new Square(n1); //3^2
        Expression n2 = new Numeral(1); //1
        Expression a1 = new Addition(s1, n2); //3^2 + 1
        Expression s2 = new Square(a1); // (3^2 + 1)^2

        System.out.println(n1);
        System.out.println(s1);
        System.out.println(n2);
        System.out.println(a1);
        System.out.println(s2);
        System.out.println(s2.evaluate());
    }
}
