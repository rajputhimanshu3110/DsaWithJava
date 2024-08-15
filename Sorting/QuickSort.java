package Sorting;

public class QuickSort {

    static int FindPivot(int arr[], int low, int high) {
        int i = low, j = high;
        int pivot = arr[low];

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void Quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = FindPivot(arr, low, high);

            Quick(arr, low, pivotIndex - 1);
            Quick(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = 6;

        Quick(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
