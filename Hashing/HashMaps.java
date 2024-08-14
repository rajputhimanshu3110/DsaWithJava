package Hashing;

import java.util.Scanner;
import java.util.HashMap;

public class HashMaps {
    static HashMap<Integer, Integer> getHashedArr(int[] arr) {
        HashMap<Integer, Integer> hashed = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            hashed.put(arr[i], hashed.get(arr[i]) != null ? (hashed.get(arr[i]) + 1) : 1);
        }
        return hashed;
    }

    public static void main(String[] args) {
        int n = 0, key = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        HashMap<Integer, Integer> hash = getHashedArr(arr);

        do {
            System.out.print("Enter the Key to check occurence: ");
            key = input.nextInt();
            System.out.print("Occurence is: ");
            System.out.println(hash.get(key));
        } while (key >= 0);
    }
}
