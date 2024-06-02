package B_Methods;

public class G_Interrupted extends Thread {

    public void run(){
        System.out.println("interrupted 1 : "+Thread.interrupted()); // true
//        System.out.println("interrupted 2 : "+Thread.interrupted()); // false
//        System.out.println("isInterrupted 1 : "+Thread.currentThread().isInterrupted()); // true ->true
//        System.out.println("isInterrupted 2 : "+Thread.currentThread().isInterrupted()); // true ->true
        try {
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
            System.out.println("interrupted : "+Thread.interrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        G_Interrupted thread = new G_Interrupted();
        thread.start();
        thread.interrupt();
    }

}
