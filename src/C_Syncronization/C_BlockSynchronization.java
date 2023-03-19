package C_Syncronization;

// this is a example of synchronized block -- in this , waiting time is less for thread-2
class BookSeatsBlockSync{
    int totalSeats =10;
    public  void bookSeats(int seats){
        synchronized (this) {
            if (totalSeats >= seats) {
                System.out.println("Seats booked : " + seats);
                totalSeats -= seats;
                System.out.println("Seats left : " + totalSeats);
            } else {
                System.out.println("Seats Not booked ! seats available " + totalSeats);

            }
        }
    }
}
public class C_BlockSynchronization {
    public static void main(String[] args) {
        
    }
}
