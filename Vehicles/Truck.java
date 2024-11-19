package TaskThree;

public class Truck extends AbstractVehicle {
    private final double load;

    public double getLoad() {
        return load;
    }

    public Truck(String name, String color, Integer numberOfWheels, double load) {
        super(name, color, numberOfWheels);
        this.load = load;
    }

    @Override
    public void Drive() {
        super.Drive();
        System.out.println("Driving Truck");
    }
}
