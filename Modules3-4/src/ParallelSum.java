
import java.util.Random;

public class ParallelSum {

    public static void main(String[] args) {

        //creates an array with 100,000 numbers
        int[] numbers = new int[100000];

        //fill the array with random numbers
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array created with " + numbers.length + " numbers.");

        //get the number of available processors
        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        //create arrays for threads and partial sums
        Thread[] threads = new Thread[numberOfThreads];
        long[] partialSums = new long[numberOfThreads];

        //calculates how many numbers each thread gets
        int portionSize = numbers.length / numberOfThreads;

        //create and start the threads
        for (int i = 0; i < numberOfThreads; i++) {

            final int threadIndex = i;

            int start = i * portionSize;
            int end;

            if (i == numberOfThreads - 1) {
                end = numbers.length;
            } else {
                end = start + portionSize;
            }

            threads[i] = new Thread(() -> {

                for (int j = start; j < end; j++) {
                    partialSums[threadIndex] += numbers[j];
                }

                System.out.println("Thread " + threadIndex +
                        " finished its calculation.");
            });

            threads[i].start();
        }

        //wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        //calculate the final sum
        long totalSum = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            totalSum += partialSums[i];
        }

        System.out.println("Final sum: " + totalSum);
    }
}
