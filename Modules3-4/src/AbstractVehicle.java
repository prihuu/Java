public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    private String type;
    private String fuel;
    private String color;
    private int year;

    public AbstractVehicle(String type, String fuel,
                           String color, int year) {

        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void displayBasicInfo() {
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge.");
    }
}