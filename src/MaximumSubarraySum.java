import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        int maxSum = numbers[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int start = 0; start < size; start++) {
            int currentSum = 0;

            for (int end = start; end < size; end++) {
                currentSum = currentSum + numbers[end];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = start;
                    endIndex = end;
                }
            }
        }

        System.out.println();
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        scanner.close();
    }
}
