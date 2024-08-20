package Array;

public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 2, 4, 5, 6, 6 };
        int appearOnce = 0;

        for (int i = 0; i < arr.length; i++) {
            appearOnce = appearOnce ^ arr[i];
        }

        System.out.print("Number Appeared once is :" + appearOnce);

    }
}
