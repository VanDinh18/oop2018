package week4.task2;


public class Circle extends Shape{
    private double radius = 1.0;

    final double pi = 3.14;

    Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = pi*radius*radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 4*pi*radius;
        return perimeter;
    }

    public String toString(){
        return super.toString() + getArea() + " " + getPerimeter();
    }
}
