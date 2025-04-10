package WithStrategyPattern;
//import WithStrategyPattern.Drive;

public class Vehicle{
	Drive myDrive;
	
	Vehicle (Drive myDrive)
	{
		this.myDrive = myDrive;
	}
	
	public void drive() {
		myDrive.MyDrive();
	}
}
