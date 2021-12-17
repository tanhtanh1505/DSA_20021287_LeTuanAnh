package Week13;

public class Test {
    private static int mx = 0;

    public static void getMax(int[] a, int m, int n){
        for(int i = 1; i <= a.length; i++){
            if(n - i >= 0){
                 m += a[i];
                 if(m > mx)
                     mx = m;
                 getMax(a, m, n-i);
                 m -= a[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 50, 140, 200};
        getMax(a, 0, 3);
        System.out.println(mx);
    }
}
