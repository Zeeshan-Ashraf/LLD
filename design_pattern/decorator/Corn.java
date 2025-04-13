package design_pattern.decorator;

public class Corn extends Toppings{
    Pizza pizza;
    private int CORN_COST = 22;

    public Corn(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + CORN_COST;
    }
}
