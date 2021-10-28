package Week7;

import edu.princeton.cs.algs4.StdRandom;

import java.util.List;

public class FindMedian {
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
            while (array[++i] < v)
                if (i == hi) break;
            while (v < array[--j])
                if (j == lo) break;
            if (i >= j) break;
            exch(array, i, j);
        }
        exch(array, lo, j);
        return j;
    }

    public static int findMedian(List<Integer> arr){
        int[] a = new int[1000];
        for(int i = 0; i < arr.size(); i++)
            a[i] = arr.get(i);
        StdRandom.shuffle(a);
        int lo = 0;
        int hi = arr.size() - 1;

        while (hi > lo){
            int j = partiton(a, lo, hi);
            if(j < arr.size()/2) lo = j+1;
            else if(j > arr.size()/2) hi = j-1;
            else return a[arr.size()/2];
        }
        return a[arr.size()/2];
    }
}
