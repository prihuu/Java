public class VehicleDemo {
    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        AbstractVehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus()
        };

        for (AbstractVehicle vehicle : vehicles) {

            vehicle.start();
            vehicle.stop();

            System.out.println(vehicle.getInfo());
            System.out.println();
        }
    }
}
