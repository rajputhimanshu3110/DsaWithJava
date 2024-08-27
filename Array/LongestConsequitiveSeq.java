package Array;

import java.util.*;

public class LongestConsequitiveSeq {

    public static int longestSuccessiveElements(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int t = it + 1;
                int c = 1;
                while (set.contains(t)) {
                    c++;
                    t++;
                }

                if (c > longest) {
                    longest = c;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = { 100, 200, 1, 2, 3, 4 };
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
