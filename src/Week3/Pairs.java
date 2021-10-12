package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int left = 0, right = 1, count = 0;
        while(right < arr.size()){
            int x = arr.get(right) - arr.get(left);
            if(x == k){
                count++;
                right++;
            }
            else if( x < k){
                right++;
            }
            else left++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(pairs(2,arr));
    }
}
//Worst Case: NlogN
//Best Case: NlogN
//Avg Case: NlogN