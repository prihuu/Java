package Orientation3;

public class Clock {

    //stores the single Clock object
    private static Clock instance;

    //stores the current simulation time
    private double time;


    private Clock() {
        time = 0.0;
    }

    //returns the single Clock object
    public static synchronized Clock getInstance() {

        if (instance == null) {
            instance = new Clock();
        }

        return instance;
    }

    //returns the current time
    public double getTime() {
        return time;
    }

    //sets the current time
    public void setTime(double time) {
        this.time = time;
    }

    //moves the clock forward
    public void advanceTime(double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Time cannot move backwards.");
        }

        time += amount;
    }
}
