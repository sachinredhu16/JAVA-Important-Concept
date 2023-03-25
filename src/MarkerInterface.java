
class Student implements Cloneable {
    String name ;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class MarkerInterface{
    public static void main(String[] arguments) throws CloneNotSupportedException {

        int Integer = 10;
        System.out.println(Integer);
    }
}
