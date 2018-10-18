package week5_6;

public class Rectangle extends Shape{
    private String name = "Rectangle";
    private int width,height;
    public Rectangle() {
    }
    public Rectangle(int x_O,int y_O,String color,int width,int height) {
        super(x_O, y_O, color);
        this.width = width;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}