package CoffeeDecoratorPackage;

public class CaramelDecorator extends CoffeeDecorator{
	
	CaramelDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost()
	{
		return coffee.cost() + 4.0;
	}

	@Override
	public String desc()
	{
		return this.coffee.desc() + ", added caramel";
	}
}