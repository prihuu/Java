public class VehicleDemo {
    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.stop();
        System.out.println(car.getInfo());

        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());

        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
