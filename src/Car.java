
public class Car {
    private double speed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private String typeName;
    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        gasolineTankCapacity = 100;
    }

    public Car(double gasolineTankCapacity, double speed) {
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
        gasolineLevel = 0;
        typeName = "Unknown";
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}
