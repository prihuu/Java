
public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate();
            super.accelerate();
            consumeGasoline(2);
        }
    }

    @Override
    void decelerate(int amount) {
        super.decelerate(amount * 2);
    }

    private void consumeGasoline(double amount) {
        useGasoline(amount);

    }
}
