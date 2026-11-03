
import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int numberOfServedCustomers = 0;

    public void addToQueueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueueue() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long serviceStartTime = System.nanoTime();

            long waitingTime = serviceStartTime - customer.getStartTime();

            //random service time between 500 and 2499 milliseconds
            long sleepTime = (long) (Math.random() * 2000) + 500;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }

            long serviceEndTime = System.nanoTime();

            customer.setEndTime(serviceEndTime);

            long serviceTime = serviceEndTime - serviceStartTime;

            //add this customers service time to the total
            totalServiceTime += serviceTime;
            numberOfServedCustomers++;

            long responseTime = customer.getEndTime() - customer.getStartTime();

            System.out.println("\nCustomer " + customer.getId() + " served.");

            System.out.println("Waiting time: "
                    + waitingTime / 1_000_000_000.0 + " seconds");

            System.out.println("Service time: "
                    + serviceTime / 1_000_000_000.0 + " seconds");

            System.out.println("Response time: "
                    + responseTime / 1_000_000_000.0 + " seconds");
        }
    }

    //calculate average service time
    public double getAverageServiceTime() {

        if (numberOfServedCustomers == 0) {
            return 0;
        }

        return (double) totalServiceTime / numberOfServedCustomers;
    }
}
