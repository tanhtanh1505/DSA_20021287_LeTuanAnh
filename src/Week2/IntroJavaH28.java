package Week2;

import java.util.Scanner;

public class IntroJavaH28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a < b && b < c) System.out.println("True");
        else System.out.println("False");
    }
}
