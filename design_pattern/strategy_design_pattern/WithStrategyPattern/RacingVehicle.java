package WithStrategyPattern;

public class RacingVehicle extends Vehicle{

	public RacingVehicle() {
		super(new SportyDrive());
	}

}
