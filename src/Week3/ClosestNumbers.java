package Week3;
//
import java.util.*;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        int minSpace = Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i = 1; i < arr.size(); i++){
            minSpace = Math.min(minSpace, arr.get(i) - arr.get(i-1));
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) - arr.get(i-1) == minSpace){
                result.add(arr.get(i-1));
                result.add(arr.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        closestNumbers(arr);
    }
}
