package Week2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int count = 0, res = 0, cnt = 0;
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                cnt++;
                res = 0;
            }
            else res++;
            count++;
        }
        if(cnt == N-1)
            System.out.println(count - res);
        else StdOut.println("FAILED");
    }
}