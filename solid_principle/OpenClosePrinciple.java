package solid_principle;

public class OpenClosePrinciple implements OpenClosable {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }

    public void polymorphism(Integer a) {
        System.out.println("one method: " + a);
    }

    public void polymorphism(Integer a, Integer b) {
        System.out.println("another method: " + a);
    }
}
