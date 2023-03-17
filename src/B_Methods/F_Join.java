package B_Methods;

public class F_Join extends Thread {
    static Thread x ;
    public void run() {
        try {
            x.join(); // using this , this will wait for main thread completion
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        F_Join thread = new F_Join();
        thread.start();
        x = Thread.currentThread();

         // thread.join(); // using this main will wait for upper thread completion
        for(int i=20;i<30;i++){
            System.out.print(i+" ");

        }
    }
}
