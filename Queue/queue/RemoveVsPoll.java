package Queue.queue;
import java.util.*;
public class RemoveVsPoll {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println("Queue : "+q);
        System.out.println("1st Poll() : "+q.poll());
        System.out.println("2nd Poll() : "+q.poll());
        System.out.println("Queue : "+q);
    }
}
