
public class OrientationTask2_2 {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        //add events jossai random järkäs
        eventList.add(new Event3(15.0, EventType.EXIT));
        eventList.add(new Event3(5.0, EventType.ARRIVAL));
        eventList.add(new Event3(20.0, EventType.EXIT));
        eventList.add(new Event3(10.0, EventType.ARRIVAL));

        System.out.println("- All events in chronological order -");
        eventList.printEvents();

        System.out.println("\n- Removing the next event -");

        Event3 nextEvent = eventList.getNextEvent();

        System.out.println("Next event: " + nextEvent);

        System.out.println("\n- Remaining events -");
        eventList.printEvents();
    }
}
