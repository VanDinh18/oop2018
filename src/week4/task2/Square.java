package week4.task2;

public class Square extends Rectangle{
    /**
     * Contructor1
     */
    public Square(){
    }

    /**
     * Contructor 2
     * @param side
     */
    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Contructor3
     * @param color
     * @param filled
     * @param side
     */
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

    /**
     *
     * @return toString
     */
    public String toString(){
        return super.toString();
    }
}
