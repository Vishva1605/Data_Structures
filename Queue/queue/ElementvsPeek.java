package Queue.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ElementvsPeek {
    public static void main(String[] args){
        Queue<Character> q = new LinkedList<>();
        q.add('A');
        q.offer('B');
        q.offer('C');
        for(int i=0;i<q.size();i++){
            System.out.print(q.peek()+" ");
        }
        for(int i=0;i<q.size();i++){
            System.out.print(q.element()+" ");
        }
        q.clear();
        q.peek();
        q.element();
    }
}
