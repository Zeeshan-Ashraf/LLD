package design_pattern.simple_factory;

public class Square implements Shape {
    @Override
    public int getArea(int length) {
        return length * length;
    }
}
