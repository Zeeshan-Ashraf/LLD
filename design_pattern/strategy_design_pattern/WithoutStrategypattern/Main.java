package WithoutStrategypattern;

import WithoutStrategypattern.OffRoadVehicle;
import WithoutStrategypattern.RacingVehicle;
import WithoutStrategypattern.SportyVechicle;
import WithoutStrategypattern.Vehicle;

public class Main {
  public static void main(String[] args) {
      System.out.println("This is the main class!");
           
      Vehicle racingcar  = new RacingVehicle();
      Vehicle normalcar  = new Vehicle();
      Vehicle offroadcar = new OffRoadVehicle();
      Vehicle sportycar  = new SportyVechicle();

      
      racingcar.Drive();
      normalcar.Drive();
      offroadcar.Drive();
      sportycar.Drive();
  }
}
