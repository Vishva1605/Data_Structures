package Queue.queue;
import java.util.*;
public class printElements {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Queue : "+q);
        System.out.print("Poll Elements : ");
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println("\nQueue : "+q);
    }
}
