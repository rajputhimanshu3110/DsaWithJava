package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 3, 2 };
        int n = 7;
        int ct1 = 0, ct2 = 0, el1 = -1, el2 = -1;
        for (int i = 0; i < n; i++) {
            if (ct1 == 0 && arr[i] != el2) {
                el1 = arr[i];
                ct1++;
            } else if (ct2 == 0 && arr[i] != el1) {
                el2 = arr[i];
                ct2++;
            } else if (arr[i] == el1) {
                ct1++;
            } else if (arr[i] == el1) {
                ct2++;
            } else {
                ct1--;
                ct2--;
            }
        }

        System.out.println("The possible numbers are in list greater that n/3 is: " + ct1 + "," + ct2);
    }
}
