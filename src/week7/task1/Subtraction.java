package week7.task1;

public class Subtraction extends BinaryExpression{
//    public Subtraction(Expression left, Expression right) {
//        super(left, right);
//    }
    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
