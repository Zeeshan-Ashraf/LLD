package interface_basics;

public class Car implements Vehicle {
    private Integer speed; // we can declare var here but we should not in Vehicle Interface

    public Car() {
        this.speed = 0;
        System.out.println("Car Constructor: car is created");
    }
    /**
     *
     */
    @Override
    public void move() {
        this.speed++;
        System.out.println("Car is moving. current speed: " + this.speed);
    }

    /**
     *
     */
    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Car is stopping. current speed:" + this.speed);
    }
}
