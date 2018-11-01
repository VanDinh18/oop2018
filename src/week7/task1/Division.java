package week7.task1;

public class Division extends BinaryExpression {
//    public Division(Expression left, Expression right) {
//        super(left, right);
//    }

    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
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
        return String.format("%s / %s", left, right);
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
