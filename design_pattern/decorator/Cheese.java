package design_pattern.decorator;

public class Cheese extends Toppings{
    private Pizza pizza;
    private int CHEESE_COST = 15;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + CHEESE_COST;
    }
}
