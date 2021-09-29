package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;
        for(int i = 0; i < q.size(); i++){
            if (q.get(i) == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q.get(i) == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (q.get(i) == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(totalBribes);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        minimumBribes(arr);
    }
}
