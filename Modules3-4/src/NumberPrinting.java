public class NumberPrinting {

    public static void main(String[] args) {

        int maxNumber = 20;

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= maxNumber; i += 2) {
                System.out.println("Odd Thread: " + i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= maxNumber; i += 2) {
                System.out.println("Even Thread: " + i);
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }

        System.out.println("Printing complete.");
    }
}
