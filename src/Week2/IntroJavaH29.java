package Week2;

//Day of week
public class IntroJavaH29 {
    public static int getDay(int d, int m, int y){
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/ 12) % 7;
    }
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]), m = Integer.parseInt(args[1]), y = Integer.parseInt(args[2]);
        System.out.println(getDay(d, m, y) + 1);
    }
}
