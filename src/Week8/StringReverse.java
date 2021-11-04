package Week8;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        for (int i = 0; i < c.length() / 2; i++)
            if (c.charAt(i) != c.charAt(c.length() - 1 - i)) {
                System.out.print("No");
                return;
            }
        System.out.print("Yes");
    }
}
