package Week6;

import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {
    private static void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partiton(int[] array, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = array[lo];
        while (true) {
            while (less(array[++i], v))
                if (i == hi) break;
            while (less(v, array[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(array, i, j);
        }
        exch(array, lo, j);
        return j;
    }

    private static boolean less(int a, int b) {
        return a < b;
    }

    private static void solve(int[] array, int lo, int hi) {
        if (hi <= lo) return;
        int j = partiton(array, lo, hi);
        solve(array, lo, j - 1);
        solve(array, j + 1, hi);
    }

    public static void sort(int[] array) {
        StdRandom.shuffle(array);
        solve(array, 0, array.length - 1);
    }
}