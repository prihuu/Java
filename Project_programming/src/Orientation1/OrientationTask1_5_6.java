public class OrientationTask1_5_6 {

    public static void main(String[] args) {

        ServicePoint servicePoint = new ServicePoint();

        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(servicePoint, 5);

        System.out.println("\n--- Starting service ---");

        servicePoint.serve();
        double averageServiceTime =
                servicePoint.getAverageServiceTime() / 1_000_000_000.0;

        System.out.println("\nAverage service time: "
                + averageServiceTime + " seconds");
    }
}