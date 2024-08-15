package Sorting;

public class MergeSort {

    static void Merge(int[] arr, int a, int mid, int e) {
        int m = mid - a + 1;
        int n = e - mid;
        int[] first = new int[m];
        int[] second = new int[n];

        for (int j = 0; j < m; j++) {
            first[j] = arr[a + j];
        }
        for (int i = 0; i < n; i++) {
            second[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = a;

        while (i < n && j < m) {
            if (first[j] < second[i]) {
                arr[k] = first[j];
                j++;
            } else {
                arr[k] = second[i];
                i++;
            }
            k++;
        }

        while (j < m) {
            arr[k] = first[j];
            j++;
            k++;
        }
        while (i < n) {
            arr[k] = second[i];
            i++;
            k++;
        }

    }

    static void Divide(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int mid = (s + e) / 2;
        Divide(arr, s, mid);
        Divide(arr, mid + 1, e);
        Merge(arr, s, mid, e);
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        Divide(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
