package Queue.queue;
import java.util.*;
public class AddandPeek {
    public static void main(String[] args){
        Queue<Character> q = new LinkedList<>();
        q.add('A');
        q.offer('B');
        q.offer('C');
        System.out.println(q);
        System.out.print("Head : "+q.peek());
    }
}
