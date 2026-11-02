public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel", "Yellow", 2022, 6.0, "MPG");
        capacity = 40;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\n"
                + "Type: " + getType() + "\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor() + "\n"
                + "Year: " + getYear() + "\n"
                + "Capacity: " + capacity + "passengers"
                + "\nFuel efficiency: " + calculateFuelEfficiency()
                + " " + getEfficiencyUnit();
    }
}