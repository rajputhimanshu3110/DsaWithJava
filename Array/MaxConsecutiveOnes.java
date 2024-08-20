package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1 };
        int count = 0, maxConsecutive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                if (arr[i] == 1) {
                    count++;
                } else {
                    if (maxConsecutive < count) {
                        maxConsecutive = count;
                    }
                    count = 0;
                }

            } else {
                if (arr[i] == 1) {
                    count++;
                }
            }
        }

        System.out.println("Max Consecutive ones are: " + maxConsecutive);
    }
}
