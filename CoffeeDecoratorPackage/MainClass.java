package CoffeeDecoratorPackage;

public class MainClass {

	public static void main(String[] args) {
		Coffee myCoffee = new Espresso();
		// ordered my coffee
		System.out.println("Coffee Type: "+myCoffee.desc());
		System.out.println("Price $"+myCoffee.cost());
		
		// adding milk
		myCoffee = new MilkDecorator(myCoffee);
		System.out.println("Coffee Type: "+myCoffee.desc());
		System.out.println("Price $"+myCoffee.cost());
		
		// adding caramel
		myCoffee = new CaramelDecorator(myCoffee);
		System.out.println("Coffee Type: "+myCoffee.desc());
		System.out.println("Price $"+myCoffee.cost());
		
		// adding cream
		myCoffee = new CreamDecorator(myCoffee);
		System.out.println("Coffee Type: "+myCoffee.desc());
		System.out.println("Price $"+myCoffee.cost());
		
		// adding double caramel
		myCoffee = new CaramelDecorator(myCoffee);
		System.out.println("Coffee Type: "+myCoffee.desc());
		System.out.println("Price $"+myCoffee.cost());

	}	
}

