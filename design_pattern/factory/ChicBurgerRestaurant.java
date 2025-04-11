package design_pattern.factory;

public class ChicBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ChicBurger();
    }
}
