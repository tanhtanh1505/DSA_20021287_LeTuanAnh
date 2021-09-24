package Week2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class Sum2 {
    public static void main(String[] args) {
        In in = new In("datatest\\4Kints.txt");
        int[] a = in.readAllInts();
        for(int i = 0; i < a.length; i++)
            a[i] = Math.abs(a[i]);
        Arrays.sort(a);
        for(int i = 0; i < a.length - 1; i++)
            if(a[i] == a[i+1])
                System.out.println("-" + a[i] + " " + a[i+1]);
    }
}