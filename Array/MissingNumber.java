package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 4, 5 };
        int xor = 0;
        for (int i = 0; i < n - 1; i++) {
            xor = xor ^ arr[i] ^ (i + 1);
        }
        xor = xor ^ n;

        System.out.println("Missing Number is: " + xor);

    }
}
