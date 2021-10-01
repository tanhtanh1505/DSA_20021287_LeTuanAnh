package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] a, int number) {
        Arrays.sort(a);
        return bSearch(a, 0, a.length - 1, number);
    }

    private static int bSearch(int[] a, int left, int right, int x) {
        if (right < left) return -1;
        int mid = (right + left) / 2;
        if (a[mid] == x) {
            return mid;
        }
        else if (a[mid] > x) {
            return bSearch(a, left, mid - 1, x);
        }
        else {
            return bSearch(a, mid + 1, right, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(binarySearch(a, 1));
    }
}
//Worst Case: LogN
//Best Case: 1
//Avg Case: ~LogN