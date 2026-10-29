public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        // test normal acceleration
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName()
                    + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // test normal deceleration
        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName()
                    + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // test cruise control sectionn
        System.out.println("\nTesting cruise control:");

        myCar.accelerate();
        myCar.accelerate();
        myCar.setTargetSpeed(50);

        System.out.println("Target speed: " + myCar.getTargetSpeed() + " km/h");

        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
            System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be activated");
        }

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is off");
    }
}
