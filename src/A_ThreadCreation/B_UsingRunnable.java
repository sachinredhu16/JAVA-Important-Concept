package A_ThreadCreation;

public class B_UsingRunnable implements Runnable {

    public static void main(String[] args) {
        B_UsingRunnable th = new B_UsingRunnable();
        Thread thread = new Thread(th);
        thread.run();
    }

    @Override
    public void run() {
        System.out.println("Executing Task 1 !");
    }
}
