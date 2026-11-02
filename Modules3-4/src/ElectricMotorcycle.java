public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", "Blue", 2025);
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
                + "Year: " + getYear();
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging...");
    }
}