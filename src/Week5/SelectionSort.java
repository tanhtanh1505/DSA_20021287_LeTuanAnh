package Week5;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class SelectionSort {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int swap = a[i];
            a[i] = a[min];
            a[min] = swap;
        }
    }

    public static void main(String[] args) {
        In in = new In("..\\..\\Algs4\\datatest\\4Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        sort(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
//        for(int i = 0; i< a.length; i++){
//            System.out.println(a[i]);
//        }
    }
}
