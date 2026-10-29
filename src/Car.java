
public class Car {
    private double speed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private String typeName;
    private double targetSpeed;
    private boolean cruiseControlOn;

    private static final double MIN_CRUISE_SPEED = 30;
    private static final double MAX_CRUISE_SPEED = 120;
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

    public void setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED
                && targetSpeed <= MAX_CRUISE_SPEED) {
            this.targetSpeed = targetSpeed;
        }
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (gasolineLevel <= 0
                || targetSpeed < MIN_CRUISE_SPEED
                || targetSpeed > MAX_CRUISE_SPEED) {
            cruiseControlOn = false;
            return false;
        }

        while (speed < targetSpeed) {
            speed = Math.min(speed + 10, targetSpeed);
        }

        while (speed > targetSpeed) {
            speed = Math.max(speed - 10, targetSpeed);
        }

        cruiseControlOn = true;
        return true;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

}
