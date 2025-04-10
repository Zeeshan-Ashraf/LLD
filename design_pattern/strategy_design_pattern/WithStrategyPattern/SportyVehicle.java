package WithStrategyPattern;

public class SportyVehicle extends Vehicle{

	public SportyVehicle() {
		super(new SportyDrive());
	}

}
