package CoffeeDecoratorPackage;

public abstract class CoffeeDecorator extends Coffee{
	
	Coffee coffee;
	
	CoffeeDecorator(Coffee coffee)
	{
		this.coffee = coffee;
	}
}
