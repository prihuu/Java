
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FibonacciCSV {

    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        try {
            PrintWriter writer = new PrintWriter(
                    new FileWriter("fibonacci.csv")
            );

            writer.println("Fibonacci Number");

            //generate 60 numbers
            for (int i = 0; i < 60; i++) {

                writer.println(first);

                long next = first + second;

                first = second;
                second = next;
            }

            writer.close();

            System.out.println("Fibonacci sequence saved to fibonacci.csv");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
