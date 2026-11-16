public class TicketMain {
    public static void main(String[] args) {

        //creates a theater with 10 available seats
        TicketReservation theater = new TicketReservation(10);

        //each customer requests a certain number of tickets
        int[] ticketRequests = {
                2, 1, 3, 3, 1,
                2, 1, 1, 3, 2,
                2, 4, 3, 1, 3
};
        //creates a thread for each customer
        Thread[] customers = new Thread[ticketRequests.length];

        for (int i = 0; i < ticketRequests.length; i++) {

            final int customerId = i + 1;
            final int tickets = ticketRequests[i];

            customers[i] = new Thread(() -> {
                theater.reserveTickets(customerId, tickets);
            });

            customers[i].start();
        }

        //wait for all customers to finish
        for (int i = 0; i < customers.length; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                System.out.println("A customer thread was interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("All customer reservations completed.");
    }
}
