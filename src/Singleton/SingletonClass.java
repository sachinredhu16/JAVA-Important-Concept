package Singleton;

class SingletonClass {
    private String id;
    private String name;

    private SingletonClass() {
        id = "100";
        name = "Sachin";
    }

    // by creating below constructor this class no more singleton
//    public Singleton(String id , String name){
//        this.id = id;
//        this.name = name;
//    }

    static SingletonClass giveObject() {
        return new SingletonClass();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
