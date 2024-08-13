package Recursion;

import java.util.Scanner;

public class ArrayReverse {
    static int[] Reverse(int[] arr, int s, int e) {
        if (s >= e) {
            return arr;
        }
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        return Reverse(arr, s + 1, e - 1);
    }

    static int[] ReverseWithSinglePointer(int[] arr, int s) {
        int n = arr.length;
        if (s >= n / 2) {
            return arr;
        }
        int temp = arr[s];
        arr[s] = arr[n - s - 1];
        arr[n - s - 1] = temp;
        return ReverseWithSinglePointer(arr, s + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int[] reversed = ReverseWithSinglePointer(arr, 0);

        for (int v : arr) {
            System.out.println(v);
        }

    }
}
