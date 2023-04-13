import org.xml.sax.InputSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{4,5,6},{7,8,9,10}};

        for(int[] x:arr){
            int[] temp = x;
            for(int y:temp)
                System.out.print(y);
            System.out.println();
        }
        System.gc();

//        Map<String, Map<String,List<String>>>


    }
}