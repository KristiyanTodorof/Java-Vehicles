package TaskThree;

public class Car extends AbstractVehicle {
    private final Integer horsePower;
    public Car(String name, String color, Integer numberOfWheels, Integer horsePower) {
        super(name, color, numberOfWheels);
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }
    @Override
    public void Drive() {
        super.Drive();
        System.out.println("Driving Car");
    }
}
