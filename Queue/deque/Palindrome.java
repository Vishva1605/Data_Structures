package Queue.deque;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Deque<Character> q = new ArrayDeque<>(Arrays.asList('m','o','a','d','a','m'));
        int n = (q.size())/2;
        boolean found = false;
        while(n>0){
            if(q.pollFirst() == q.pollLast()){
                found = true;
            }else{
                found = false;
                break;
            }
            n--;
        }
        System.out.println(found);
    }
}
