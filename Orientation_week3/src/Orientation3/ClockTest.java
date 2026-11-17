package Orientation3;

public class ClockTest {

    public static void main(String[] args) {

        //get the Clock instance twice
        Clock clock1 = Clock.getInstance();
        Clock clock2 = Clock.getInstance();

        //check initial time
        System.out.println("Initial time: " + clock1.getTime());

        //set time using the first reference
        clock1.setTime(10.0);

        System.out.println("Clock 1 time: " + clock1.getTime());

        //read time using the second reference
        System.out.println("Clock 2 time: " + clock2.getTime());

        //advance time using the second reference
        clock2.advanceTime(5.0);

        System.out.println("After advancing: " + clock1.getTime());

        //checks whether both references point to the same object
        System.out.println("Same clock object: " + (clock1 == clock2));
    }
}
