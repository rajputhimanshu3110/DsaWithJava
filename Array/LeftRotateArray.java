package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        int i = 0, temp = arr[i];
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
