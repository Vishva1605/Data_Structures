package Queue.queue;
import java.util.*;
public class ReverseKTimes {
    public static Queue<Integer> reverse(Queue<Integer> qq){
        if(qq.isEmpty()) return qq;
        int front = qq.poll();
        reverse(qq);
        qq.add(front);
        return qq;
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        Queue<Integer> qq = new LinkedList<>();
        int k = 3;
        while(k>0){
            qq.add(q.poll());
            k--;
        }
        reverse(qq);
        while(!q.isEmpty()){
            qq.add(q.poll());
        }
        System.out.println(qq);
    }
}
