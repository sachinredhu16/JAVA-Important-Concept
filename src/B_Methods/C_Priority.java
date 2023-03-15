package B_Methods;

public class C_Priority extends Thread{
    public void run(){
        System.out.println("Executing Thread ! ");
    }

    public static void main(String[] args) {
        System.out.println("Main thread priority is  : "+Thread.currentThread().getPriority());

        C_Priority thread = new C_Priority();
        thread.setPriority(8);
        System.out.println("Custom priority is  : "+thread.getPriority());

    }
}
