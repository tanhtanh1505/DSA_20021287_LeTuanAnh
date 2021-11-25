package Week5;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else {
                if(st.isEmpty()){
                    return "NO";
                }
                else {
                    switch (s.charAt(i)){
                        case '}':
                            if(st.pop() != '{')
                                return "NO";
                            break;
                        case ']':
                            if(st.pop() != '[')
                                return "NO";
                            break;
                        case ')':
                            if(st.pop() != '(')
                                return "NO";
                            break;
                    }
                }
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