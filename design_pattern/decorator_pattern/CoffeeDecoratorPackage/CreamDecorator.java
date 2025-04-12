package CoffeeDecoratorPackage;

public class CreamDecorator extends CoffeeDecorator{
	
	CreamDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost()
	{
		return coffee.cost() + 3.0;
	}

	@Override
	public String desc()
	{
		return this.coffee.desc() + ", added cream";
	}

}
