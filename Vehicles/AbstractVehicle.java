package TaskThree;

public class AbstractVehicle implements Vehicle {
    private final String name;
    private final String color;
    private final Integer numberOfWheels;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public AbstractVehicle(String name, String color, Integer numberOfWheels) {
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void Drive() {

    }
}
