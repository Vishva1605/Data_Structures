package Queue.queue;
import java.util.*;
public class ReverseUsingStack {
    public static Queue<Integer> printReverse1(Queue<Integer> q){// stack
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        return q;
    }
    public static Queue<Integer> printReverse2(Queue<Integer> q){// recursion
        if(q.isEmpty()) return q;
        int front = q.poll();
        printReverse2(q);
        q.add(front);
        return q;
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        System.out.println("original Queue : "+q);
        System.out.println("Reversed Queue : "+printReverse1(q));
        System.out.println("Reversed Queue : "+printReverse2(q));
    }
}
