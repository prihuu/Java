import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celcius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in Celcius: %.1f C%n", celcius);

        scanner.close();


    }
}
