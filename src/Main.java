import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"ll","ll"};
        int n = words.length;
        int count =0;
        String same ="";
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = words[i];
            String reverse = "";
            reverse += s.charAt(1);
            reverse += s.charAt(0);
            if(s.equals(reverse))
                same = s;
//            System.out.println(s+" "+reverse);
            if(map.containsKey(reverse) && map.get(reverse)>0){
                System.out.println("inside "+reverse);
                count +=4;
                map.put(reverse,map.get(reverse)-1);
                if(reverse.equals(same))
                    same = "";
            }
            else{
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        if(!same.isEmpty())
            count +=2;
        System.out.println(count);
    }
}