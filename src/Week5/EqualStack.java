package Week5;

import java.util.List;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        h1.add(0);
        h2.add(0);
        h3.add(0);
        for(int i = h1.size() - 2; i >= 0 ; i--){
            h1.set(i, h1.get(i) + h1.get(i+1));
        }
        for(int i = h2.size() - 2; i >= 0 ; i--){
            h2.set(i, h2.get(i) + h2.get(i+1));
        }
        for(int i = h3.size() - 2; i >= 0 ; i--){
            h3.set(i, h3.get(i) + h3.get(i+1));
        }
        int x1 = 0, x2 = 0, x3 = 0;
        while(!(h1.get(x1) == h2.get(x2) && h1.get(x1) == h3.get(x3))){
            if(h1.get(x1) > h2.get(x2) || h1.get(x1) > h3.get(x3))
                x1++;
            else if(h2.get(x2) > h1.get(x1) || h2.get(x2) > h3.get(x3))
                x2++;
            else if(h3.get(x3) > h1.get(x1) || h3.get(x3) > h2.get(x2))
                x3++;
        }
        return h1.get(x1);
    }
}
