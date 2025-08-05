package Queue.queue;
import java.util.*;
public class AddvsOffer {
    public static void main(String[] args){
        Queue<Character> q = new LinkedList<>();
        q.add('X');
        q.add('Y');
        q.add('Z');
        System.out.println("Added Elements : "+q);
        // while(!q.isEmpty()){
        //     q.remove();
        // }
        q.clear();
        q.offer('X');
        q.offer('Y');
        q.offer('Z');
        System.out.println("Offered Elements : "+q);
    }
}
