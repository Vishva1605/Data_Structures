package Queue.queue;
import java.util.*;
public class CheckQEqual {
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(1,2,7,4,5));
        System.out.println("The Queues are Equal ? : "+checkEquals(q1,q2));
    }
    public static boolean checkEquals(Queue<Integer> q1,Queue<Integer> q2){
        if(q1.size() != q2.size()) return false;
        Iterator<Integer> it1 = q1.iterator();
        Iterator<Integer> it2 = q2.iterator();
        while(it1.hasNext() && it2.hasNext()){
            if(!it1.next().equals(it2.next())){
                return false;
            }
        }
        return true;
    }
}
