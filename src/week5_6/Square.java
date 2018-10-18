package week5_6;

public class Square extends Shape{
    private String name = "Square";
    //Kích thước cạnh hình vuông
    private int side;

    public Square() {
    }
    public Square(int x_O,int y_O,String color,int side) {
        super(x_O, y_O, color);
        this.side = side;
    }

    public String getName() {
        return name;
    }
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}