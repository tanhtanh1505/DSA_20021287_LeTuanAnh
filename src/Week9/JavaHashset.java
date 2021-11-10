package Week9;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    static class Pair {
        public String name1;
        public String name2;

        Pair(String name1, String name2) {
            this.name1 = name1;
            this.name2 = name2;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(!(o instanceof Pair)) return false;

            Pair pair = (Pair) o;
            if(name1.equals(pair.name1) && name2.equals(pair.name2))
                return true;
            return false;
        }

        @Override
        public int hashCode() {
            int result = name1.hashCode();
            result = 100 * result + name2.hashCode();
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Pair> listP = new HashSet<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            listP.add(new Pair(sc.next(), sc.next()));
            System.out.println(listP.size());
        }
    }
}
