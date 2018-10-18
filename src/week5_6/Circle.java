package week5_6;

public class Circle extends Shape{
    private String name = "Circle";
    private int  radius;
    public Circle() {
    }
    public Circle(int x_O,int y_O,String color,int radius) {
        super(x_O, y_O, color);
        this.radius = radius;
    }
    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}