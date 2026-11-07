

public class Event implements Comparable<Event> {

    private double eventTime;
    private EventType eventType;

    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public double getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event time: " + eventTime
                + ", Event type: " + eventType;
    }
}
