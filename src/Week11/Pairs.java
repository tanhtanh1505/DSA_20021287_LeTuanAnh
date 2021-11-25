package Week11;

import java.util.HashSet;
import java.util.List;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        int count  = 0;
        HashSet<Integer> hs = new HashSet<>(arr);
        for(int x : hs){
            if(hs.contains(x + k))
                count++;
        }
        return count;

    }
}
