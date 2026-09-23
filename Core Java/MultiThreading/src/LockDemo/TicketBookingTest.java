package LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBooking{
    int availableSeats = 1;
    Lock lock = new ReentrantLock();

    void bookTicket(String userName){
        boolean locked = lock.tryLock();

        if (locked){
            try {
                if (availableSeats > 0){
                    System.out.println(userName+" is booking ticket");
                    Thread.sleep(5000);
                    availableSeats--;
                    System.out.println(userName+" booking successful");
                }
                else {
                    System.out.println(userName+" no seat available");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(userName+" could not get lock, try again");
            System.out.println(userName+" let me do something else");
        }
    }
}
class TicketThread extends Thread{
    TicketBooking ticketBooking;
    String username;

    TicketThread(TicketBooking ticketBooking, String username){
        this.ticketBooking = ticketBooking;
        this.username = username;
    }

    @Override
    public void run() {
        ticketBooking.bookTicket(username);
    }
}
public class TicketBookingTest {
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();

        TicketThread t1 = new TicketThread(ticketBooking, "kanak");
        TicketThread t2 = new TicketThread(ticketBooking, "rahul");

        t1.start();
        t2.start();
    }
}
