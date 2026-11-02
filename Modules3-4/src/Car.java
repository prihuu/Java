public class Car extends AbstractVehicle {

    public Car() {
        super("Car", "Petrol", "Red", 2024);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Car Information:\n"
                + "Type: " + getType() + "\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor() + "\n"
                + "Year: " + getYear();
    }
}