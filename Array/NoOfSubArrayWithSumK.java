package Array;

import java.util.*;

public class NoOfSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 3, 1, 1, 1, 6, 2 };
        int k = 3, sum = 0, c = 0;

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        hash.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int remove = sum - k;
            int a = hash.containsKey(sum) ? hash.get(sum) : 0;
            c += hash.containsKey(remove) ? hash.get(remove) : 0;

            hash.put(sum, a + 1);
        }

        hash.clear();

        System.out.println(c);
    }
}
