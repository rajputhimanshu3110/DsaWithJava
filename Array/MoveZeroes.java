package Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 2, 3, 0, 4 };
        int n = 8, j = 0;

        // Approach 1
        // int[] arr2 = new int[n];
        // for (int i : arr) {
        // if (i != 0) {
        // arr2[j++] = i;
        // }
        // }
        // j = 0;
        // for (int i : arr2) {
        // arr[j++] = i;
        // }

        // Optimal Zero

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < n) {
            arr[j] = 0;
            j++;
        }

        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}
