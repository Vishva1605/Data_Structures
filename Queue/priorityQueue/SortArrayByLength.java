package Queue.priorityQueue;
import java.util.*;
public class SortArrayByLength{
    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return Integer.compare(s1.length(),s2.length());
            }
        });
        q.addAll(Arrays.asList("apple", "kiwi", "banana"));
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
