public class OrientationTask1_3 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.setStartTime(1000);
        customer1.setEndTime(5000);

        customer2.setStartTime(2000);
        customer2.setEndTime(7000);

        customer3.setStartTime(3000);
        customer3.setEndTime(9000);

        System.out.println("Customer " + customer1.getId()
                + " time spent: " + customer1.getTimeSpent());

        System.out.println("Customer " + customer2.getId()
                + " time spent: " + customer2.getTimeSpent());

        System.out.println("Customer " + customer3.getId()
                + " time spent: " + customer3.getTimeSpent());
    }
}