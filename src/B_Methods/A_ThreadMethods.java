package B_Methods;

public class A_ThreadMethods extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("current thread is : "+Thread.currentThread().getName());
        Thread.currentThread().setName("My thread");
        System.out.println("current thread is : "+Thread.currentThread().getName());

        A_ThreadMethods thread = new A_ThreadMethods();
        thread.start();

        System.out.println("Main thread is alive : "+Thread.currentThread().isAlive());
        System.out.println("custom thread is alive : "+thread.isAlive());
    }
}
