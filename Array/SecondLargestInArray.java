package Array;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = 6;

        int largest = arr[0], secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];

            } else if (secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
