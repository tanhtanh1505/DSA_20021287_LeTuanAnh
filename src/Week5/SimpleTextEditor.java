package Week5;

import java.util.Scanner;

public class SimpleTextEditor {
    private String content;
    private Stack<String> stack = new Stack<>();

    SimpleTextEditor(){
        content = "";
    }

    public void append(String w){
        stack.push(content);
        content += w;
    }

    public void delete(int k){
        if(k <= content.length() && k > 0) {
            stack.push(content);
            for(int i = content.length() - 1; k > 0; k--){
                content = content.substring(0, i) + content.substring(i + 1);
                i--;
            }
        }
    }

    public void print(int k){
        if(k <= content.length() && k >= 1)
            System.out.println(content.charAt(k-1));
    }

    public void undo(){
        if(!stack.isEmpty()){
            content = stack.peek();
            stack.pop();
        }
    }

    public String show(){
        return content;
    }

    public static void main(String[] args) {
        SimpleTextEditor s = new SimpleTextEditor();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        while(n > 0){
            int mode = sc.nextInt();
            if(mode == 1){
                s.append(sc.next());
            }
            else if(mode == 2){
                s.delete(sc.nextInt());
            }
            else if(mode == 3){
                s.print(sc.nextInt());
            }
            else if(mode == 4){
                s.undo();
            }
            System.out.println(s.show());
            n--;
        }
    }
}
