package X_Genrics;

// T extends Number == input class which is child class of Number
// T super Integer == input class which is parent of Integer
class Generic<T extends Number> {
    public void method(T x) {
        System.out.println(x);
    }
}
