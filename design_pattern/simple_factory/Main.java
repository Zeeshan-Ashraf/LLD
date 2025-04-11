package design_pattern.simple_factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Factory");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        System.out.println(circle.getArea(10));

        Shape square = shapeFactory.getShape("square");
        System.out.println(square.getArea(5));
    }
}
