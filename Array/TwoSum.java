package Array;

import java.util.HashMap;

public class TwoSum {
    static int[] UsingHashing(int[] arr, int sum) {
        HashMap<Integer, Integer> Hash = new HashMap<Integer, Integer>();
        int[] Index = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            Hash.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (Hash.containsKey(sum - arr[i])) {
                Index[0] = i;
                Index[1] = Hash.get(sum - arr[i]);
                return Index;
            }
        }

        return Index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7, 3, 8, 4 };
        int sum = 12;

        int[] index = UsingHashing(arr, sum);

        System.out.println("Indices are : {" + index[0] + "," + index[1] + "}");

    }
}
