package TaskThree;

public class Bus extends AbstractVehicle {
    private final Integer numberOfPassengers;

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Bus(String name, String color, Integer numberOfWheels, Integer numberOfPassengers) {
        super(name, color, numberOfWheels);
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public void Drive() {
        super.Drive();
        System.out.println("Driving Bus");
    }
}
