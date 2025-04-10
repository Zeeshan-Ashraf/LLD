package WithStrategyPattern;

import WithStrategyPattern.Vehicle;
import WithStrategyPattern.RacingVehicle;
import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.SportyVehicle;

public class Main {
  public static void main(String[] args) {
      System.out.println("This is the main class!");
      
      Vehicle offRoadCar = new OffRoadVehicle();
      Vehicle sportyCar  = new SportyVehicle();
      Vehicle racingCar  = new RacingVehicle();
      
      offRoadCar.drive();
      sportyCar.drive();
      racingCar.drive();
  }
}
