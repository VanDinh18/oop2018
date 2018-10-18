package week5_6;

public class Shape {
    private int x_O;
    private int y_O;
    private String color;
    private String name;
    public Shape() {
    }

    public Shape(int x_O,int y_O,String color) {
        this.x_O = x_O;
        this.y_O = y_O;
        this.color = color;
    }

    public int getX_O() {
        return x_O;
    }

    public void setX_O(int x_O) {
        this.x_O = x_O;
    }

    public int getY_O() {
        return y_O;
    }

    public void setY_O(int y_O) {
        this.y_O = y_O;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void move(int x,int y){
        this.setX_O(x);
        this.setY_O(y);
    }
}
