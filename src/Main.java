import org.xml.sax.InputSource;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

class Generic<T extends Number> {
    public void method(T x){
        System.out.println(x);
    }
}
public class Main {
    public static void main(String[] args) {
        HashMap<String , String > map = new HashMap<>();
        map.put(null,"this is null !");
        System.out.println(map.get(null));

        Hashtable<String , String > table = new Hashtable<>();
        table.put(null,"this is null !");
        System.out.println(table.get(null));


    }
}