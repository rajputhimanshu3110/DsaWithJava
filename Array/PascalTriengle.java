package Array;

public class PascalTriengle {
    static void printPascal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 1; i <= n; i++) {
            int ans = 1;
            arr[i - 1][0] = ans;
            for (int j = 1; j < i; j++) {
                ans = ans * (i - j);
                ans = ans / (j);
                arr[i - 1][j] = ans;
            }
        }

        for (int i[] : arr) {
            for (int j : i) {
                if (j != 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPascal(n);

    }
}
