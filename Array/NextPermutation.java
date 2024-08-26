package Array;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 7, 3 };
        int n = 5, ind = -1;

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }

        for (int i = n - 1; i > ind; i--) {

            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        for (int i = n - 1; i > (n - 1 + ind) / 2; i--) {
            int temp = arr[i];
            arr[i] = arr[n + ind - i];
            arr[n + ind - i] = temp;
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
