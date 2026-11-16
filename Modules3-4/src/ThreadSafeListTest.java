
public class ThreadSafeListTest {

    public static void main(String[] args) {

        ThreadSafeList list = new ThreadSafeList();

        int numberOfThreads = 5;
        int elementsPerThread = 1000;

        Thread[] threads = new Thread[numberOfThreads];

        //each thread adds 1000 elements
        for (int i = 0; i < numberOfThreads; i++) {

            final int threadNumber = i;

            threads[i] = new Thread(() -> {

                for (int j = 0; j < elementsPerThread; j++) {
                    list.add("Thread-" + threadNumber + "-Item-" + j);
                }

            });

            threads[i].start();
        }

        //wait for all threads to finish adding
        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Size after adding: " + list.size());

        //creates new threads to remove elements
        for (int i = 0; i < numberOfThreads; i++) {

            final int threadNumber = i;

            threads[i] = new Thread(() -> {

                for (int j = 0; j < elementsPerThread; j++) {
                    list.remove("Thread-" + threadNumber + "-Item-" + j);
                }

            });

            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Size after removing: " + list.size());

    }
}
