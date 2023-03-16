package B_Methods;

public class E_Yield extends Thread {
    public static void main(String[] args) {
        E_Yield thread = new E_Yield();
        thread.start();
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
    }
    public void run(){
        Thread.yield();
        for(int i=20;i<30;i++){
            System.out.print(i+" ");
        }
    }
}
