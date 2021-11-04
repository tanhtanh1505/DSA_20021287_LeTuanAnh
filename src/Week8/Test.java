package Week8;

import edu.princeton.cs.algs4.StdIn;

public class Test {
    public static void main(String[] args) {
        CountWords cw = new CountWords();
        while (!StdIn.isEmpty()){
            cw.add(StdIn.readString());
        }
        System.out.println(cw.getCount());
    }
}
