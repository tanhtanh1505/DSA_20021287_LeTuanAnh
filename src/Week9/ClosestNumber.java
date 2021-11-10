package Week9;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> a) {
        int minSpace = Integer.MAX_VALUE;
        Integer[] arr = (Integer[]) a.toArray();
        MergeSort.sort(arr);
        for(int i = 1; i < arr.length; i++){
            minSpace = Math.min(minSpace, arr[i] - arr[i-1]);
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == minSpace){
                result.add(arr[i-1]);
                result.add(arr[i]);
            }
        }
        return result;

    }
}
