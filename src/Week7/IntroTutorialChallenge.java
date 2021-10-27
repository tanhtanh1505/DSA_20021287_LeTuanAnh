package Week7;

import java.util.List;

public class IntroTutorialChallenge {
    private static int bSearch(List<Integer> a, int left, int right, int x) {
        if (right < left) return -1;
        int mid = (right + left) / 2;
        if (a.get(mid) == x) {
            return mid;
        }
        else if (a.get(mid) > x) {
            return bSearch(a, left, mid - 1, x);
        }
        else {
            return bSearch(a, mid + 1, right, x);
        }
    }

    public static int introTutorial(int V, List<Integer> a) {
        return bSearch(a, 0, a.size() - 1, V);

    }
}
