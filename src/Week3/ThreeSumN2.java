package Week3;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;

public class ThreeSumN2 {
    public static int solve(int[] a) {
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            int l = i+1, r = a.length-1;
            while(l < r){
                if(a[i] + a[l] + a[r] == 0){
                    //System.out.println(a[i] + " " + l + " " + r);
                    count++;
                    l++;
                    r--;
                }
                else if(a[i] + a[l] + a[r] > 0){
                    r--;
                }
                else l++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        In in = new In("datatest\\8Kints.txt");
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = solve(a);;
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);
    }
}

//Worst Case: N^2
//Best Case: N*N/2
//Avg Case: ~N^2