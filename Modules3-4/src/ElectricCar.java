public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", "White", 2025);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting silently...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\n"
                + "Type: " + getType() + "\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor() + "\n"
                + "Year: " + getYear();
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging...");
    }
}