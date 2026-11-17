package Orientation3;

import eduni.distributions.ContinuousGenerator;

public class ArrivalProcess {

    private EventType3 eventType;
    private ContinuousGenerator generator;

    //constructor
    public ArrivalProcess(EventType3 eventType, ContinuousGenerator generator) {
        this.eventType = eventType;
        this.generator = generator;
    }

    //generate a new event and add it to the event list
    public void generateNextEvent(EventList3 eventList) {

        //get the shared simulation clock
        Clock clock = Clock.getInstance();

        //generate a random time interval
        double interval = generator.sample();

        //calculate the next event time
        double eventTime = clock.getTime() + interval;

        //move the clock to the new event time
        clock.setTime(eventTime);

        //create a new event
        Event3 event = new Event3(eventTime, eventType);

        //adds the event to the event list
        eventList.addEvent(event);
    }
}
