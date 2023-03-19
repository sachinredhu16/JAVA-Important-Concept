package C_Syncronization;


// this is a example of synchronized method -- in this , waiting time is more for thread-2
class BookSeatsSync{
     int totalSeats =10;
    public synchronized void bookSeats(int seats){
        if(totalSeats>=seats){
            System.out.println("Seats booked : "+seats );
            totalSeats -=seats;
            System.out.println("Seats left : "+totalSeats);
        }
        else{
            System.out.println("Seats Not booked ! seats available "+totalSeats);

        }
    }
}
public class B_WithSynchronization extends Thread{
    static BookSeatsSync b;
    static int seats;
    public void run(){
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookSeatsSync();
        B_WithSynchronization personA = new B_WithSynchronization();
        seats = 7;
        personA.start();

        B_WithSynchronization personB = new B_WithSynchronization();
        seats = 6;
        personB.start();
    }
}
