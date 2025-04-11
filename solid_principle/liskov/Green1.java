package solid_principle.liskov;

public class Green1 implements Color {
    @Override
    public void getColor() {
        System.out.println("Green");
    }
}
