package MultithreadingCodingQues;
/*
* T1 1
* T2 2
* T3 3
* T1 4
* T2 5
* T3 6
* T1 7
* T2 8
* T3 9
* T1 10*/

class Pat{
    private int a = 1;
    private int turn = 1;
    private int n =0;
    public Pat(int n){
        this.n = n;
    }

    public synchronized void printT1() throws InterruptedException {
        while(a<=n){
            while(turn!=1){
                wait();
            }
            if(a<=n)
                System.out.println(Thread.currentThread().getName()+" : "+ a++);
            turn =2;
            notifyAll();
        }
    }
    public synchronized void printT2() throws InterruptedException {
        while(a<=n){
            while(turn!=2){
                wait();
            }
            if(a<=n)
                System.out.println(Thread.currentThread().getName()+" : "+a++);
            turn =3;
            notifyAll();
        }
    }
    public synchronized void printT3() throws InterruptedException {
        while(a<=n){
            while(turn!=3){
                wait();
            }
            if(a<=n)
                System.out.println(Thread.currentThread().getName()+" : "+a++);
            turn =1;
            notifyAll();
        }
    }
}
public class A_Pattern {
    public static void main(String[] args) {
        final Pat pat = new Pat(10);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pat.printT1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pat.printT2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pat.printT3();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setName("T1");
        t1.start();
        t2.setName("T2");
        t2.start();
        t3.setName("T3");
        t3.start();

    }
}
