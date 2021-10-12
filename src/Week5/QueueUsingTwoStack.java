package Week5;

import java.util.Scanner;

class QueueUsingTwoStack<Item> {
    private Stack<Item> in;
    private Stack<Item> out;
    //out - in
    QueueUsingTwoStack(){
        in = new Stack<>();
        out = new Stack<>();
    }

    public void enqueue(Item item){
        in.push(item);
        System.out.println("In pushed" + item);
    }

    private void moveData(){
        while(!in.isEmpty()){
            out.push(in.pop());
        }
    }

    public void dequeue(){
        if(out.isEmpty()){
            moveData();
        }
        System.out.println(out.pop());
    }

    public Item print(){
        if(out.isEmpty()){
            moveData();
        }
        return out.peek();
    }


    public static void main(String[] args) {
        QueueUsingTwoStack<String> q = new QueueUsingTwoStack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            int mode = sc.nextInt();
            if(mode == 1){
                String item = sc.next();
                q.enqueue(item);
            }
            else if(mode == 2){
                q.dequeue();
            }
            else if(mode == 3){
                System.out.println(q.print());
            }

            n--;
        }
    }
}