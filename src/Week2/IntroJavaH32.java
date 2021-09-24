package Week2;

import java.util.Scanner;

public class IntroJavaH32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double red = sc.nextDouble(), green = sc.nextDouble(), blue = sc.nextDouble();
        double white = Math.max(red / 255, green / 255);
        white = Math.max( white, blue / 255);
        double cyan = (white - red / 255) / white;
        double magenta = (white - green / 255) / white;
        double yellow = (white - blue / 255) / white;
        double black = 1 - white;
        System.out.println(white + " " + cyan + " " + magenta + " " + yellow + " " + black);
    }
}
