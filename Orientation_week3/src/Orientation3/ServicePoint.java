package Orientation3;

import java.util.LinkedList;
import java.util.Queue;

public class ServicePoint {

    private Queue<Customer> queue;

    public ServicePoint() {
        queue = new LinkedList<>();
    }

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public Customer serve() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getQueueSize() {
        return queue.size();
    }
}
