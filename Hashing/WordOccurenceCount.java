package Hashing;

import java.util.Scanner;

public class WordOccurenceCount {

    static int[] getCharHash(char[] arr, int n) {
        int[] hash = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 'a') <= 26 && (arr[i] - 'a') >= 0)
                hash[arr[i] - 'a']++;
            else if ((arr[i] - 'A') <= 26)
                hash[arr[i] - 'A']++;
        }

        return hash;

    }

    public static void main(String[] args) {
        int n = 0;
        char key = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        n = input.nextInt();
        char[] arr = new char[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.next().charAt(0);
        }
        int[] hash = getCharHash(arr, 26);

        do {
            System.out.print("Enter the Key to check occurence: ");
            key = input.next().charAt(0);
            System.out.print("Occurence is: ");
            if (key == -1)
                break;
            else if ((key - 'a') <= 26 && (key - 'a') >= 0)
                System.out.println(hash[key - 'a']);
            else if ((key - 'A') <= 26)
                System.out.println(hash[key - 'A']);

        } while (true);
    }
}
