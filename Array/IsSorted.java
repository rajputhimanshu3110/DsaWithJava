package Array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 5, 8, 6 };
        int n = 7, i = 1, flag = 1;

        for (i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Array is not Sorted");
        } else {
            System.out.println("Array is Sorted");
        }
    }
}
