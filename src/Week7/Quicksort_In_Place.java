package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort_In_Place {
    public static void exch(List<Integer> arr, int i, int j) {
        Integer temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }

    public static int partition(List<Integer> arr,int lo,int hi) {
        Integer pivot = arr.get(hi);
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr.get(j) < pivot) {
                exch(arr, i, j);
                i++;
            }
        }
        exch(arr,i,hi);
        return i;
    }

    public static void sort(List<Integer> arr,int lo,int hi) {
        if (hi <= lo) return;
        int j = partition(arr,lo,hi);
        for (Integer i : arr)
            System.out.print(i + " ");
        System.out.println();

        sort(arr,lo,j - 1);
        sort(arr,j + 1,hi);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0;i < n;i++) list.add(scan.nextInt());
        sort(list,0,n - 1);
    }
}
