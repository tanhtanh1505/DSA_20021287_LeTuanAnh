package Week5;

import java.util.List;

public class EqualStack {
    public static int FindMax(Stack<Integer> first, Stack<Integer> second, Stack<Integer> third)
    {
        int a = first.pop();
        int b = second.pop();
        int c = third.pop();
        first.push(a);
        second.push(b);
        third.push(c);
        if (a == b && a == c) return 3;
        if (a >= b && a >= c) return 0;
        else if (b >= a && b >= c) return 1;
        return 2;
    }
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3)
    {
        Stack<Integer> First = new Stack<>();
        First.push(0);
        Stack<Integer> Second = new Stack<>();
        Second.push(0);
        Stack<Integer> Third = new Stack<>();
        Third.push(0);

        int sum = 0;
        for (int i = h1.size() - 1;i >= 0;i--)
        {
            sum += h1.get(i);
            First.push(sum);
        }

        sum = 0;
        for (int i = h2.size() - 1;i >= 0;i--)
        {
            sum += h2.get(i);
            Second.push(sum);
        }

        sum = 0;
        for (int i = h3.size() - 1;i >= 0;i--)
        {
            sum += h3.get(i);
            Third.push(sum);
        }

        while (true)
        {
            int c = FindMax(First,Second,Third);
            if (c == 3) return First.pop();
            else if (c == 0) First.pop();
            else if (c == 1) Second.pop();
            else if (c == 2) Third.pop();
        }
    }
}
