public class TicketReservation {
    private int availableSeats;

    public TicketReservation(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void reserveTickets(int customerId, int tickets) {

        if (tickets <= availableSeats) {

            availableSeats -= tickets;

            System.out.println("Customer " + customerId +
                    " reserved " + tickets + " tickets.");

        } else {

            System.out.println("Customer " + customerId +
                    " couldn't reserve " + tickets + " tickets.");
        }
    }

}
