package week7.task1;

public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
