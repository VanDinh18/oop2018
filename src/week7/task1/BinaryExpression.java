package week7.task1;

public abstract class BinaryExpression extends Expression {
//    protected Expression left;
////    protected Expression right;
//
//    public Expression getLeft() {
//        return left;
//    }
//    public Expression getRight() {
//        return right;
//    }
//
//    public BinaryExpression(Expression left, Expression right) {
//        this.left = left;
//        this.right = right;
//    }

    public abstract Expression left();

    public abstract Expression right();

    @Override
    public abstract String toString();

    @Override
    public abstract int evaluate();
}