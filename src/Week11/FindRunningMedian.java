package Week11;

import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class FindRunningMedian {

    private static class Number implements Comparable<Number> {
        private final Integer value;
        private final int pos;

        public Number(Integer val, int p) {
            value = val;
            pos = p;
        }

        public int compareTo(Number that) {
            if (!this.value.equals(that.value)) {
                return this.value - that.value;
            }
            return this.pos - that.pos;
        }

        public String toString() {
            StringBuilder string = new StringBuilder();
            string.append(String.format("(%d, %d)", value, pos));
            return string.toString();
        }
    }

    public static Comparator<Number> natural() {
        class natural implements Comparator<Number> {
            @Override
            public int compare(Number a, Number b) {
                return a.compareTo(b);
            }
        }
        return new natural();
    }

    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> result = new ArrayList<>();
        TreeSet<Number> head = new TreeSet<>();
        TreeSet<Number> tail = new TreeSet<>();
        int count = 1;
        for (Integer i : a) {
            if (count <= 2) head.add(new Number(i, count++));
            else {
                if (count % 2 == 1) {
                    tail.add(new Number(i, count++));
                    tail.add(head.pollFirst());
                    head.add(tail.pollLast());
                } else {
                    tail.add(new Number(i, count++));
                    head.add(tail.pollLast());
                }
            }

            if ((count - 1) % 2 == 1) {
                result.add(Double.valueOf(head.first().value));
            } else {
                Number temp = head.pollFirst();
                result.add((double) (temp.value + head.first().value) / 2);
                head.add(temp);
            }
        }
        return result;
    }
}
