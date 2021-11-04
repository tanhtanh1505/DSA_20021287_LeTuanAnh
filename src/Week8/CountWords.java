package Week8;

import java.util.PriorityQueue;

public class CountWords {
    private PriorityQueue<String> listWord = new PriorityQueue<>();

    public CountWords(){
    }

    public void add(String word){
        listWord.add(word);
    }

    public String getCount(){
        StringBuilder res = new StringBuilder();
        while (listWord.size() > 0){
            String word = listWord.peek();
            int count = 0;
            while (word.equals(listWord.peek())){
                count++;
                listWord.poll();
            }
            res.append(word + " " + count + "\n");
        }
        return res.toString();
    }

}
