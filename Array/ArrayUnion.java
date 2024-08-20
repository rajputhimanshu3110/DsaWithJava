package Array;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 7, 8 };
        int[] arr2 = { 1, 2, 7, 8, 9 };
        int[] union = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (k != 0 && arr1[i] != union[k - 1]) {
                    union[k] = arr1[i];
                    k++;
                } else if (k == 0) {
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            } else {
                if (k != 0 && arr2[j] != union[k - 1]) {
                    union[k] = arr2[j];
                    k++;
                } else if (k == 0) {
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            }
        }

        while (i < arr1.length) {
            union[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            union[k] = arr2[j];
            k++;
            j++;
        }

        for (int a = 0; a < k; a++) {
            System.out.print(union[a] + " ");
        }

    }
}
