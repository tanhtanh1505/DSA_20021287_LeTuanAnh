package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

import java.io.PrintWriter;
import java.util.*;

public class TestTimeSort {
    static String path = "..\\..\\Algs4\\datatest\\32Kints.txt";

    static int[] TaoDuLieuNgauNhien(){
        In in = new In(path);
        int[] a = in.readAllInts();

        for (int i = 0;i < a.length ;i++)
        {
            int x = StdRandom.uniform(i + 1);
            int temp = a[x];
            a[x] = a[i];
            a[i] = temp;
        }

        return a;
    }

    static int[] TaoDuLieuXepTangDan(){
        In in = new In(path);
        int[] a = in.readAllInts();

        Arrays.sort(a);
        return a;
    }

    static int[] TaoDuLieuXepGiamDan(){
        In in = new In(path);
        int[] a = in.readAllInts();

        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        return a;
    }

    static int[] TaoDuLieuBangNhau(){
        In in = new In(path);
        int[] a = in.readAllInts();

        for(int i = 0; i < a.length; i++)
            a[i] = 100;

        return a;
    }

    public static void main(String[] args) {
        //QuickSort
        In in = new In(path);
        int[] a = in.readAllInts();
        long start = System.currentTimeMillis();
        QuickSort.sort(a);
        StdOut.println("elapsed time = " + (System.currentTimeMillis() - start));

        a = TaoDuLieuNgauNhien();
        start = System.currentTimeMillis();
        QuickSort.sort(a);
        StdOut.println("elapsed time = " + (System.currentTimeMillis() - start));

        a = TaoDuLieuXepTangDan();
        start = System.currentTimeMillis();
        QuickSort.sort(a);
        StdOut.println("elapsed time = " + (System.currentTimeMillis() - start));

        a = TaoDuLieuXepGiamDan();
        start = System.currentTimeMillis();
        QuickSort.sort(a);
        StdOut.println("elapsed time = " + (System.currentTimeMillis() - start));

        a = TaoDuLieuBangNhau();
        start = System.currentTimeMillis();
        QuickSort.sort(a);
        StdOut.println("elapsed time = " + (System.currentTimeMillis() - start));

    }
}
