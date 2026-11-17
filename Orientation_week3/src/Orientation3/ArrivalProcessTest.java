package Orientation3;

import eduni.distributions.Negexp;

public class ArrivalProcessTest {

    public static void main(String[] args) {

        //get the simulation clock
        Clock clock = Clock.getInstance();

        //start simulation at time zero
        clock.setTime(0.0);

        //create an empty event list
        EventList3 eventList = new EventList3();

        //creates a negative exponential generator
        Negexp generator = new Negexp(5.0);

        //creates an arrival process
        ArrivalProcess arrivalProcess =
                new ArrivalProcess(EventType3.ARRIVAL, generator);

        //generates 10 events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNextEvent(eventList);
        }

        //prints all generated events
        System.out.println("Generated events:");

        eventList.printEvents();

        //print final simulation time
        System.out.println();
        System.out.println("Final clock time: " + clock.getTime());

        //print number of events
        System.out.println("Total events: " + eventList.size());
    }
}
