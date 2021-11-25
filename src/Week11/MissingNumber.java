package Week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static List<Integer> missingNumbersC1(List<Integer> arr, List<Integer> brr) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < brr.size(); i++){
            Integer x = brr.get(i);
            brr.remove(i);
            i--;
            if(arr.contains(x)){
                arr.remove(x);
            }
            else {
                if(!brr.contains(x))
                    res.add(x);
            }
        }
        Collections.sort(res);
        return res;
    }
    //Hash table
    public static List<Integer> missingNumbersC2(List<Integer> arr, List<Integer> brr) {
        Hashtable<Integer, Integer> solve = new Hashtable<>();
        for (Integer i : arr)
            if (solve.containsKey(i)) {
                solve.put(i, solve.get(i) + 1);
            } else {
                solve.put(i, 1);
            }
        List<Integer> result = new ArrayList<>();
        for (Integer i : brr)
            if (solve.containsKey(i) && solve.get(i) >= 1) {
                solve.put(i, solve.get(i) - 1);
            }
            else {
                result.add(i);
            }
        Collections.sort(result);
        return result;
    }

    //sort
    public static List<Integer> missingNumbersC3(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        Collections.sort(brr);
        List<Integer> result = new ArrayList<>();
        int i = 0,j = 0;
        while (i < arr.size() && j < brr.size()) {
            if (arr.get(i).equals(brr.get(j))) {
                i++;
                j++;
            }
            else if (arr.get(i) < brr.get(j)) {
                while (i < arr.size() && arr.get(i) < brr.get(j)) i++;
            }
            else if (arr.get(i) > brr.get(j)) {
                while (j < brr.size() && brr.get(j) < arr.get(i)) {
                    result.add(brr.get(j));
                    j++;
                }
            }
        }
        if (j < brr.size()) {
            for (; j < brr.size(); j++)
                result.add(brr.get(j));
        }
        result = result.stream().distinct().collect(Collectors.toList());
        return result;
    }

    public static List<Integer> missingNumbersC4(List<Integer> arr, List<Integer> brr) {
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        int[] count = new int[max - min + 1];
        for (Integer i : arr) count[i - min]++;
        List<Integer> result = new ArrayList<>();
        for (Integer i : brr)
            if (i < min || i > max || count[i - min] == 0) {
                result.add(i);
            } else {
                count[i - min]--;
            }

        result = result.stream().distinct().collect(Collectors.toList());
        Collections.sort(result);
        return result;
    }
}