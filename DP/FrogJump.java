package DP;

public class FrogJump {

    static int jump(int n, int[] DP, int[] arr){
        if(n==0) return 0;
        if(DP[n]!=0){
            return DP[n];
        }
        int left = jump(n-1, DP,arr) + Math.abs(arr[n]-arr[n-1]);
        int right;
        if(n-1>0){
            right = jump(n-2, DP,arr) + Math.abs(arr[n]-arr[n-2]);
        }else{
            right = Integer.MAX_VALUE;
        }
        System.out.println(left+" "+right);
        DP[n]= Math.min(left, right);

        return Math.min(left, right);
        
    }
    public static void main(String[] args) {
        int n=4;
        int[] DP = new int[n+1];
        int[] arr = {10,5,25,4};
        int totalJump = jump(n-1, DP, arr);
        System.out.println(totalJump);
    }
}
