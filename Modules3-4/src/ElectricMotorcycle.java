public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", "Blue", 2025, 0.08, "kWh/km");
    }

    @Override
    public void start() {
        System.out.println("Electric motorcycle is starting silently...");
    }

    @Override
    public void stop() {
        System.out.println("Electric motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\n"
                + "Type: " + getType() + "\n"
                + "Fuel: " + getFuel() + "\n"
                + "Color: " + getColor() + "\n"
                + "Year: " + getYear()
                + "\nEnergy efficiency: " + calculateFuelEfficiency()
                + " " + getEfficiencyUnit();
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging...");
    }
}