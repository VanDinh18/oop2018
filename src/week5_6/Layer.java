package week5_6;

import java.util.ArrayList;

public class Layer {
    boolean visible;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    //Thêm shape vào layer
    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }
    // Xóa Triangle trong layer
    public void DeleteTriangle(){
        for(int i=0;i<shapes.size();i++){
            if(getShapes().get(i) instanceof Triangle){
                getShapes().remove(i);
                i--;
            }
        }
    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    //In tên tất cả cá hình trong layer
    public void PrintShape(){
        int i;
        for(i=0;i<shapes.size();i++){
            System.out.println(shapes.get(i).getName());
        }
    }
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}