package Recursion;

import java.util.Scanner;

public class NSum {
    static void SumN(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        SumN(i - 1, sum + i);
    }

    static int sumOfN(int n) {
        if (n < 1) {
            return 0;
        }

        return n + sumOfN(n - 1);
    }

    public static void main(String[] args) {
        // Problem : Sum of first N Numbers using Recursion

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number to find sum of n number : ");
        int n = input.nextInt();

        System.out.println(sumOfN(n));

    }
}
