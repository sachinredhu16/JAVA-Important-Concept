package Y_MarkerInterface;

public class MarkerInterface{
    public static void main(String[] arguments) throws CloneNotSupportedException {

        Student student = new Student();
        if(student instanceof Cloneable)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
