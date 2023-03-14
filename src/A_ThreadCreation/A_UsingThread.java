package A_ThreadCreation;

public class A_UsingThread extends Thread{

    public void run(){
        System.out.println("Executing the task !");
    }
    public static void main(String[] args) {

        // single thread perform single task
        A_UsingThread thread1 = new A_UsingThread();
        thread1.start();

        // multiple thread perform single task
        A_UsingThread thread2 = new A_UsingThread();
        thread2.start();
        A_UsingThread thread3 = new A_UsingThread();
        thread3.start();

    }
}
