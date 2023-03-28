package Singleton;

public class SingletonClassImpl {
    public static void main(String[] args) {
        // Singleton Object
        SingletonClass singleton = SingletonClass.giveObject();
        System.out.println(singleton.getId()+" "+singleton.getName());

        // not singleton because of parameterized constructor
//        Singleton singleton1 = new Singleton("200","Sangeet");
//        System.out.println(singleton1.getId()+" "+singleton1.getName());

    }
}