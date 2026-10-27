import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter end: ");
        int end = Integer.parseInt(scanner.nextLine());

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            } else {
                for (int divisor = 2; divisor < number; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
