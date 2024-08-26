package Array;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 3, 0, 1, -2, 4, -1 };
        int n = 9;
        int sum = 0, max = -9999, start = 0, end = 0;
        for (int i = 1; i < n; i++) {

            sum += arr[i];
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }

            if (sum > max) {
                max = sum;
                end = i;
            }

        }

        System.out.println("Maximum Array sum is: " + max + " with position " + start + " " + end);
    }
}
