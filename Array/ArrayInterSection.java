package Array;

public class ArrayInterSection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 7, 8 };
        int[] arr2 = { 1, 2, 7, 8, 9 };
        int[] intersection = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        for (int a = 0; a < k; a++) {
            System.out.print(intersection[a] + " ");
        }
    }
}
