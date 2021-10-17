package Week5;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
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
        In in = new In("..\\..\\Algs4\\datatest\\16Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        sort(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());

//        In in2 = new In("..\\..\\Algs4\\datatest\\16Kints.txt");
//        int[] b = in2.readAllInts();
//        Stopwatch timer2 = new Stopwatch();
//        for (int i = 1;i <= 100;i++)
//        {
//            int x;
//            int y;
//            do
//            {
//                x = StdRandom.uniform(b.length - 1);
//                y = StdRandom.uniform(b.length -1);
//            } while (x != y);
//            int temp = b[x];
//            b[x] = b[y];
//            b[y] = temp;
//        }
//        sort(b);
//        StdOut.println("elapsed time = " + timer2.elapsedTime());
    }
}
