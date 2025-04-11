package solid_principle.liskov;

public class Blue1 implements Color {
    @Override
    public void getColor() {
        System.out.println("Blue");
    }
}
