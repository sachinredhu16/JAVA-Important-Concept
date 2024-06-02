package B_Methods;

public class B_DaemonMethod extends Thread{
    public void run(){
        System.out.println("Executing the thread !");
    }

    public static void main(String[] args) {
//        Thread.currentThread().setDaemon(true); --> this will give IllegalThreadStateException
        System.out.println("Main method is Daemon : "+Thread.currentThread().isDaemon());

        B_DaemonMethod b = new B_DaemonMethod();
        b.setDaemon(true);
        b.start();
        System.out.println("b is Daemon : "+ b.isDaemon());
    }
}
