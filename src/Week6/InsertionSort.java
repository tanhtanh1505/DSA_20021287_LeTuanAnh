package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class InsertionSort {
    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(a[j] < a[j-1]) {
                    int swap = a[j];
                    a[j] = a[j-1];
                    a[j-1] = swap;
                }
                else break;
            }
        }
    }

    public static void main(String[] args) {
        //(1) Cac file du lieu test
        In in = new In("..\\..\\Algs4\\datatest\\4Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        sort(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());

        //(2) Du lieu sinh ngau nhien


    }
}
