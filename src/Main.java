import java.util.*;

class Cust implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        list.add(l1);

        queue.addAll(l1);

    }

}