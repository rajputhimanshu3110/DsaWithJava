package Array;

import java.util.HashMap;

public class LongestSubArray {

    static int LongestSubArrayUsinhHashing(int[] arr, int k) {
        HashMap<Integer, Integer> Hash = new HashMap<Integer, Integer>();
        int sum = 0;
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                longest = Math.max(longest, i + 1);
            }

            int d = sum - k;
            if (Hash.containsKey(d)) {
                longest = Math.max(longest, i - Hash.get(d));
            }

            if (!Hash.containsKey(sum)) {
                Hash.put(sum, i);
            }
        }

        return longest;
    }

    static int LongestSubArrayUsingGreedy(int[] arr, int k) {
        int longest = 0;
        int i = 0, j = 0;

        while (i < arr.length && j < arr.length) {

            int sum = 0;

            for (int a = j; a <= i; a++) {
                sum += arr[a];
            }
            if (sum == k) {
                longest = Math.max(longest, i - j + 1);
                i++;
            } else if (sum > k) {
                j++;
            } else {
                i++;
            }
        }

        return longest;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 1, 1, 1, 6, 2 };
        int k = 7;

        System.out.println(LongestSubArrayUsingGreedy(arr, k));

    }
}
