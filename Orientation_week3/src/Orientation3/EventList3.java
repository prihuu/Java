package Orientation3;

import java.util.ArrayList;

public class EventList3 {

    private ArrayList<Event3> events;

    //constructor
    public EventList3() {
        events = new ArrayList<>();
    }

    //add an event to the list
    public void addEvent(Event3 event) {
        events.add(event);
    }

    //get all events
    public ArrayList<Event3> getEvents() {
        return events;
    }

    //print all events
    public void printEvents() {

        for (Event3 event : events) {
            System.out.println(event);
        }
    }

    //get number of events
    public int size() {
        return events.size();
    }
}
