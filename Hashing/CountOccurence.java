package Hashing;

import java.util.Scanner;

public class CountOccurence {

    static int[] getHashedArr(int[] arr, int HashSize) {
        int[] hashed = new int[HashSize];

        for (int i = 0; i < arr.length; i++) {
            hashed[arr[i]]++;
        }
        return hashed;
    }

    public static void main(String[] args) {
        int n = 0, m = 0, key = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        n = input.nextInt();
        System.out.print("Enter the size of Hash: ");
        m = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] hash = getHashedArr(arr, m);

        do {
            System.out.print("Enter the Key to check occurence: ");
            key = input.nextInt();
            System.out.print("Occurence is: ");
            System.out.println(hash[key]);
        } while (key >= 0);

    }
}
