package week4.task2;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    /**
     * Contructor1
     */
    public Rectangle(){
    }

    /**
     * Contructor 2
     * @param width
     * @param length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Contructor3
     * @param color
     * @param filled
     * @param width
     * @param length
     */
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Tính diện tích
     * @return area
     */
    public double getArea(){
        double area = width*length;
        return area;
    }

    /**
     * Tính chu vi
     * @return perimeter
     */
    public double getPerimeter(){
        double perimeter = 2*(width + length);
        return perimeter;
    }

    /**
     *
     * @return soString
     */
    public String toString(){
        return super.toString() + getArea() + " " + getPerimeter();
    }
}
