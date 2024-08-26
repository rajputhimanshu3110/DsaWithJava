package Array;

public class MooreVoting {

    // Moore Voting Algorithm
    public static void main(String[] args) {
        int[] arr = { 6, 6, 6, 1, 1, 1, 1, 6, 1, 6, 6 };
        int max = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            } else {
                if (count == 0) {
                    max = arr[i];
                    count++;
                } else {
                    count--;
                }
            }
        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                a++;
            }
        }

        if (a > arr.length / 2) {
            System.out.println(max + " is the max element");
        } else {
            System.out.println("There is no maxm element");
        }
    }
}
