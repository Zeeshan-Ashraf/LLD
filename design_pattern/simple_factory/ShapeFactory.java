package design_pattern.simple_factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape.equalsIgnoreCase("square")){
            return new Square();
        }
        else if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        throw new IllegalArgumentException();
    }
}
