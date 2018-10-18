package week5_6;

public class Main {
    public static void main(String[] args) {
        int i;
        Diagram diagram = new Diagram();
        for(i=0;i<6;i++) {
            Layer layer = new Layer();
            layer.addShape(new Circle());
            layer.addShape(new Square());
            layer.addShape(new Triangle());
            layer.addShape(new Triangle());
            layer.addShape(new Rectangle());
            layer.addShape(new Circle());
            diagram.addLayer(layer);
        }

        diagram.DeleteCircle();

        diagram.getLayers().get(0).DeleteTriangle();

        for(i=0;i<diagram.getLayers().size();i++){
            diagram.getLayers().get(i).PrintShape();
        }
    }
}
