package Week8;

import java.util.List;
import java.util.PriorityQueue;

public class JesseAndCookies {
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> c = new PriorityQueue<>();
        c.addAll(A);
        int i = 0;
        while (true) {
            Integer first = c.poll();
            if (first >= k) return i;
            else if (c.size() == 0) return -1;
            Integer second = c.poll();
            c.add(first + 2*second);
            i++;
        }
    }
}
