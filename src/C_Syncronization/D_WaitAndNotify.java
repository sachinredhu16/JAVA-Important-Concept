package C_Syncronization;

class TotalEarning extends Thread{
    int total =0;
    public void run(){
        synchronized (this) {
            for (int i = 1; i < 11; i++) {
                total += 100;
            }
            this.notify();
        }

    }
}

public class D_WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning totalEarning = new TotalEarning();
        totalEarning.start();
//        System.out.println("Earning is : "+totalEarning.total);
        synchronized (totalEarning){
            totalEarning.wait();
        }
        System.out.println("Earning is : "+totalEarning.total);
    }
}
