package Orientation3;

public class Event3 {

    private double time;
    private EventType3 type;

    //constructor
    public Event3(double time, EventType3 type) {
        this.time = time;
        this.type = type;
    }

    //returns event time
    public double getTime() {
        return time;
    }

    //returns event type
    public EventType3 getType() {
        return type;
    }

    //displays event information
    @Override
    public String toString() {
        return "Event time: " + time + ", Event type: " + type;
    }
}
