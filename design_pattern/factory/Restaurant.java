package design_pattern.factory;

public abstract class Restaurant {
    public abstract Burger createBurger();

    public Burger prepareBurger() {
        Burger burger = createBurger();
        burger.cook();
        return burger;
    }
}
