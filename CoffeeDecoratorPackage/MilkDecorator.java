package CoffeeDecoratorPackage;

public class MilkDecorator extends CoffeeDecorator{

	MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost()
	{
		return coffee.cost() + 2.0;
	}

	@Override
	public String desc()
	{
		return this.coffee.desc() + ", added milk ";
	}
	
}
