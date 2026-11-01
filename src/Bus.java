
public class Bus extends Car {

    private int passengerCount;
    private int maxPassengers;

    public Bus(String typeName, int maxPassengers) {
        super(typeName);
        this.maxPassengers = maxPassengers;
        passengerCount = 0;
    }

    public void passengerEnter() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
            System.out.println("A passenger entered the bus.");
        } else {
            System.out.println("The bus is full!");
        }
    }

    public void passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("A passenger left the bus.");
        } else {
            System.out.println("The bus is empty!");
        }
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void displayPassengers() {
        System.out.println("Passengers: " + passengerCount
                + "/" + maxPassengers);
    }
}

