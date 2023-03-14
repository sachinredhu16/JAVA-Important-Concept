package A_ThreadCreation;

class Task1 extends Thread{
    public void run(){
        System.out.println("Executing the Task 1 !");
    }
}
class Task2 extends Thread{
    public void run(){
        System.out.println("Executing the Task 2 !");
    }
}
public class B_MultipleTaskMultipleThread {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.start();

        Task2 task2 = new Task2();
        task2.start();
    }

}
