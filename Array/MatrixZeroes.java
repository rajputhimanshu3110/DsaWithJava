package Array;

public class MatrixZeroes {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 1 }, { 1, 1, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };
        int n = arr.length;
        int m = arr[0].length;
        int col = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    if (j != 0) {
                        arr[i][0] = 0;
                        arr[0][j] = 0;
                    } else {
                        col = 0;
                        arr[i][0] = 0;
                    }
                }
            }
        }

        for (int j = 0; j < m; j++) {
            if (arr[0][0] == 0) {
                arr[0][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            if (col == 0) {
                arr[i][0] = 0;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
