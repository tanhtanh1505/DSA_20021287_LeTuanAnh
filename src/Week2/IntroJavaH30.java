package Week2;

public class IntroJavaH30 {
    public static void main(String[] args) {
        double[] a = new double[5];
        double mx = 0, mi = 1, mid = 0;
        for(int i = 0; i < 5; i++) {
            a[i] = Math.random();
            mx = Math.max(mx, a[i]);
            mi = Math.min(mi, a[i]);
            mid += a[i];
        }
        System.out.println(mi + " " + mx + " " + (mid/5));
    }
}
