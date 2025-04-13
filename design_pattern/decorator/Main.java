package design_pattern.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("decorator pattern");

        Pizza margeritaPizza = new Margerita();

        Pizza mergeritaCheesPizza = new Cheese(margeritaPizza);

        Pizza mergeritaCheeseCornPizza = new Corn(mergeritaCheesPizza);

        System.out.println(mergeritaCheeseCornPizza.cost());
    }
}
