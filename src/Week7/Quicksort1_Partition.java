package Week7;

import java.util.List;

public class Quicksort1_Partition {
    private static void exch(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    public List<Integer> partition(List<Integer> arr) {
        int i = 0;
        int j = arr.size();
        int v = arr.get(0);
        while (true) {
            while (arr.get(++i) < v)
                if (i == arr.size() - 1) break;
            while (arr.get(--j) > v)
                if (j == 0) break;
            exch(arr, i, j);
            if (i >= j) break;
        }
        exch(arr, i, j);
        return arr;
    }
}
