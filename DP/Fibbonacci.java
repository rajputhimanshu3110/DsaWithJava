package DP;

public class Fibbonacci {

    //using recursion memoization
    static int getFibbo(int n,int[] DP){
        if(n<=1)
            return n;
        
        if(DP[n]!=-1) return DP[n];

        return getFibbo(n-1, DP)+getFibbo(n-2, DP);
    }
    public static void main(String[] args) {
        int n=5;
        int[] DP = {-1,-1,-1,-1,-1,-1,-1};

        int value = getFibbo(n,DP);

        System.out.println(value);


        //using tabulation
        int[] DP2 = new int[n+1];
        DP2[0] = 0;
        DP2[1] = 1;

        for(int i=2;i<=n;i++){
            DP2[i] = DP2[i-1] + DP2[i-2];
        }

        System.out.println(DP2[n]);
    }
}
