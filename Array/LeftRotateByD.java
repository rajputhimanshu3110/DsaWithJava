package Array;

public class LeftRotateByD {
    // left rotate an array by D places
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        int d = 3;
        d %= n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i + d < n) {
                arr[i] = arr[i + d];
            } else {
                arr[i] = temp[i - (n - d)];
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
