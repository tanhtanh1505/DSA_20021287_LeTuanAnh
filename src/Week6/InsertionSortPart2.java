package Week6;

import java.util.List;

public class InsertionSortPart2 {
    public static void insertionSort2(int n, List<Integer> a) {
        //print(a);
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(a.get(j) < a.get(j-1)) {
                    int swap = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, swap);
                }
                else break;
            }
            print(a);
        }

    }

    public static void print(List<Integer> a){
        for (int k = 0; k < a.size(); k++)
            System.out.print(a.get(k) + " ");
        System.out.println("");
    }
}
