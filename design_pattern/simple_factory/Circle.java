package design_pattern.simple_factory;

public class Circle implements Shape {
    @Override
    public int getArea(int radius) {
        return radius*radius*3;
    }
}
