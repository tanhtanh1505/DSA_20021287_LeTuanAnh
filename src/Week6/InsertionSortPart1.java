package Week6;

import java.util.List;

public class InsertionSortPart1 {
    public static void insertionSort1(int n, List<Integer> a) {
        int x = a.get(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0 || x > a.get(i - 1)) {
                a.set(i, x);
                print(a);
                break;
            }
            else {
                a.set(i, a.get(i - 1));
                print(a);
            }
        }
    }

    public static void print(List<Integer> a){
        for (int k = 0; k < a.size(); k++)
            System.out.print(a.get(k) + " ");
        System.out.println("");
    }
}
