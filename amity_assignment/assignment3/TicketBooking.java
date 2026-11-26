// Shared Resource
class TicketBooking {
    private int availableSeats;

    public TicketBooking(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Synchronized method to prevent race conditions
    public synchronized void bookSeat(int seats) {
        String user = Thread.currentThread().getName();
        System.out.println(user + " is trying to book " + seats + " seat(s)...");

        if (seats <= 0) {
            System.out.println(user + ": Invalid number of seats requested.");
        } else if (seats <= availableSeats) {
            System.out.println(user + ": Seats available. Processing booking...");
            try {
                // Simulating payment/processing delay to prove synchronization works
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(user + ": Booking interrupted.");
            }
            availableSeats -= seats;
            System.out.println(user + " successfully booked " + seats + " seat(s). Remaining seats: " + availableSeats);
        } else {
            System.out.println(user + " failed to book " + seats + " seat(s). Only " + availableSeats + " seat(s) left.");
        }
    }
}

// Thread class 1
class User1 extends Thread {
    private TicketBooking booking;
    private int seatsToBook;

    public User1(TicketBooking booking, int seatsToBook) {
        super("User 1");
        this.booking = booking;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
        booking.bookSeat(seatsToBook);
    }
}

// Thread class 2
class User2 extends Thread {
    private TicketBooking booking;
    private int seatsToBook;

    public User2(TicketBooking booking, int seatsToBook) {
        super("User 2");
        this.booking = booking;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
        booking.bookSeat(seatsToBook);
    }
}

public class RailwayTicketBooking {
    public static void main(String[] args) {
        // Shared TicketBooking object with 5 available seats
        TicketBooking sharedBooking = new TicketBooking(5);

        // Both users try to book 3 seats at the same time (total 6 > 5)
        User1 u1 = new User1(sharedBooking, 3);
        User2 u2 = new User2(sharedBooking, 3);

        u1.start();
        u2.start();
    }
}
