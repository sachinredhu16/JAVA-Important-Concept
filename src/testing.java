public class testing {
    public static void main(String[] args) {
        String s ="a good   example";

        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].isBlank()) {
                if(!ans.isEmpty())
                    ans.append(" ");
                ans.append(arr[i]);
            }
        }
        System.out.println(ans.toString());


    }
}
