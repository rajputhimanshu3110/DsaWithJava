package Array;

public class SortThree {
    // Sort Zeroes ones and two's

    static int[] UsingDutchNationalFlag(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            int temp = arr[mid];
            if (arr[mid] == 0) {
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 1, 0, 2 };

        int[] sorted = UsingDutchNationalFlag(arr);

        for (int i : sorted) {
            System.out.println(i + " ");
        }
    }
}
