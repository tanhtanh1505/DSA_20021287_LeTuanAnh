package Week5;

import java.util.Scanner;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else {
                if(s.charAt(i) == st.peek()){
                    st.pop();
                }
                else return "NO";
            }
        }
        if(st.isEmpty()){
            return "YES";
        }
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }
}