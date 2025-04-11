package design_pattern.factory;

public class VegBurger implements Burger {
    @Override
    public void cook() {
        System.out.println("Preparing Veg Burger");
    }
}
