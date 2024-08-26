package Array;

import java.util.Scanner;

public class RearrangeElement {

    static void ReArrange(int[] arr, int n) {
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                ans[pos] = arr[i];
                pos += 2;

            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[8];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextInt();
        }

        ReArrange(arr, 8);

    }
}
