package design_pattern.factory;

/**
 * Code for factory pattern (not simple factory pattern)
 * here similar Object creation is delegated to subclass of Service
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.12t34la5vlet
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern");
        System.out.println("Chicken burger do");

        ChicBurgerRestaurant chicBurgerRestaurant = new ChicBurgerRestaurant();
        chicBurgerRestaurant.prepareBurger();
    }
}
