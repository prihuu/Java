public class Calculator {

    private int result;

    public Calculator() {
        this.result = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must not be negative");
        }
        result += number;
    }

    public int getValue() {
        return result;
    }

    public void reset() {
        result = 0;
    }
}
