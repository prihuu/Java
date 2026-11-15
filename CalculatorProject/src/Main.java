public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(5);
        calculator.add(10);
        calculator.add(20);

        System.out.println("Current value: " + calculator.getValue());

        calculator.reset();

        System.out.println("After reset: " + calculator.getValue());

        //adding a negative number
        calculator.add(-5);
    }
}
