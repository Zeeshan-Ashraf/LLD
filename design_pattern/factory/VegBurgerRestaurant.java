package design_pattern.factory;

public class VegBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
