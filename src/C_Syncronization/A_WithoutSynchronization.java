package C_Syncronization;

class BookSeats{
     int totalSeats =10;
    public void bookSeats(int seats){
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
public class A_WithoutSynchronization extends Thread{
    static BookSeats b;
    static int seats;
    public void run(){
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookSeats();
        A_WithoutSynchronization personA = new A_WithoutSynchronization();
        seats = 7;
        personA.start();

        A_WithoutSynchronization personB = new A_WithoutSynchronization();
        seats = 6;
        personB.start();
    }
}
