package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 100; i++)
            a.add(0);
        for(Integer key : arr){
            a.set(key, a.get(key) + 1);
        }
        return a;
    }
}
