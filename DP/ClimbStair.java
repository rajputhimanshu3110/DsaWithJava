package DP;

public class ClimbStair {

    static int climb(int n){
        
        if(n<=1){
           return 1; 
        } 
        int left = climb(n-1);
        int right = climb(n-2);

        return left + right;
    }
    public static void main(String[] args) {
        int n = 6;
        int ways  = climb(n);

        System.out.println(ways);

    }
}
