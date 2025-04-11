package design_pattern.factory;

public class ChicBurger implements Burger {
    @Override
    public void cook() {
        System.out.println("ChicBurger Prepare");
    }
}
