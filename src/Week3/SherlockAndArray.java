package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {
    public static String balancedSums(List<Integer> arr) {
        arr.add(0,0);
        arr.add(0);
        for(int i = 1; i < arr.size(); i++){
            arr.set(i, arr.get(i) + arr.get(i-1));
        }
        int sum = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++){
            if(sum - arr.get(i) == arr.get(i-1)){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(balancedSums(arr));
    }
}
