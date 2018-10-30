package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression num1 = new Numeral(10); //10
        Expression squa1 = new Square(num1); //10^2
        Expression num2 = new Numeral(1); //1
        Expression sub1 = new Subtraction(squa1, num2); //10^2-1
        Expression num3 = new Numeral(2); //2
        Expression num4 = new Numeral(3); //3
        Expression mul1 = new Multiplication(num3, num4); //2*3
        Expression add1 = new Addition(sub1, mul1);
        Expression squa2 = new Square(add1); //(10^2-1+2*3)^2
        System.out.println(squa2);
        System.out.println(squa2.evaluate());

        try {
            Expression num = new Numeral(0);
            Expression div1 = new Division(num1, num); // 10/0
            System.out.println(div1.evaluate());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
