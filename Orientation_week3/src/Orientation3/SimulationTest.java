package Orientation3;

import eduni.distributions.Negexp;

public class SimulationTest {

    public static void main(String[] args) {

        //gets the simulation clock and resets it
        Clock clock = Clock.getInstance();
        clock.setTime(0.0);

        //creates an event list
        EventList3 eventList = new EventList3();

        //creates the arrival process
        Negexp generator = new Negexp(5.0);
        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType3.ARRIVAL, generator);

        //generates 10 arrival events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList);
        }

        System.out.println("Generated events:");
        eventList.printEvents();

        //creates a service point
        ServicePoint servicePoint = new ServicePoint();

        //converts events into customers and adds them to the queue
        for (Event3 event : eventList.getEvents()) {
            Customer customer = new Customer(event.getTime());
            servicePoint.addCustomer(customer);
        }

        System.out.println();
        System.out.println("Customers in queue: "
                + servicePoint.getQueueSize());

        clock.advanceTime(5.0);

        System.out.println("Clock time: " + clock.getTime());

        //serves customers one by one
        System.out.println();
        System.out.println("Customer service results:");

        while (!servicePoint.isEmpty()) {

            Customer customer = servicePoint.serve();

            double timeSpent =
                    clock.getTime() - customer.getArrivalTime();

            System.out.println(
                    "Arrival time: " + customer.getArrivalTime()
                            + ", Departure time: " + clock.getTime()
                            + ", Time spent: " + timeSpent
            );
        }

        System.out.println();
        System.out.println("Customers remaining: "
                + servicePoint.getQueueSize());
    }
}
