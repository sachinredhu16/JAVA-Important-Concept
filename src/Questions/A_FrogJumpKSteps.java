package Questions;

import java.util.Arrays;

public class A_FrogJumpKSteps {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        int k = 2;
        System.out.println(helper(arr,0,k,dp));

    }
    public static int helper(int[] arr, int ind,int k,int[] dp){
        if(arr.length-1==ind)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int min = Integer.MAX_VALUE;
        int temp = ind+k;
        for(int i=ind+1;i<=temp && i<arr.length;i++){
            int result = Math.abs(arr[ind]-arr[i])+helper(arr,i,k,dp);
            min = Math.min(min,result);
        }
        dp[ind] = min;
        return min;
    }
}
