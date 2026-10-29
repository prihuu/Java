public class CoffeeMaker {
    private boolean on;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        on = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public void setCoffeeType(String coffeeType) {
        if (on && (coffeeType.equals("normal") || coffeeType.equals("espresso"))) {
            this.coffeeType = coffeeType;
        }
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (on && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }

    public boolean isOn() {
        return on;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
