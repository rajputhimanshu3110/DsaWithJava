package Array;

public class SuperiorElement {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 2, 7, 3 };
        int n = arr.length, max = -9999, j = 0;
        int[] superior = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                superior[j] = max;
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(superior[i] + " ");
        }
    }
}
