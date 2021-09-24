package Week2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class Sum3 {
    public static void solve(int[] a) {
        Arrays.sort(a);
        for(int i = 0; i < a.length-1; i++){
            int l = i+1, r = a.length-1;
            while(l < r){
                if(a[i] + l + r == 0){
                    System.out.println(a[i] + " " + l + " " + r);
                    l++;
                    r--;
                }
                else if(a[i] + l + r > 0){
                    r--;
                }
                else l++;
            }
        }

    }
    public static void main(String[] args) {
        In in = new In("datatest\\8Kints.txt");
        int[] a = in.readAllInts();
        solve(a);
    }
}