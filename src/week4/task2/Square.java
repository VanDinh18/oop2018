package week4.task2;

public class Square extends Rectangle{
    public Square(){
    }

    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(String color, boolean filled, double side) {
        super.setColor(color);
        super.setFilled(filled);
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        //super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLenth(double side){
        super.setLength(side);
    }

    public String toString(){
        return super.toString();
    }
}
