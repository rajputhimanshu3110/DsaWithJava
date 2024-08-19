package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4 };
        int n = 8;

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(i + 1);

    }
}
