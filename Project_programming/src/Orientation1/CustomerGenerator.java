public class CustomerGenerator {

    public void generateCustomers(ServicePoint servicePoint, int numberOfCustomers) {

        for (int i = 0; i < numberOfCustomers; i++) {

            Customer customer = new Customer();

            customer.setStartTime(System.nanoTime());

            servicePoint.addToQueueue(customer);

            System.out.println("Customer " + customer.getId()
                    + " added to the service queue.");
        }
    }
}