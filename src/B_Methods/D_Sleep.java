package B_Methods;

public class D_Sleep extends Thread{
    public static void main(String[] args) throws InterruptedException {
        D_Sleep thread1 = new D_Sleep();
        thread1.start();
//        D_Sleep thread2 = new D_Sleep();
//        thread2.start();
        for(int i=0;i<10;i++){
//            Thread.sleep(1000); // this sleep this thread main
            System.out.print(i+" ");
        }

    }

    public void run() {
        for(int i=20;i<30;i++){
            try {
                Thread.sleep(1000); // this sleep this thread Thread-0
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i+" ");
        }
    }
}
