package Iterator;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,3,2,1));
        ListIterator<Integer> it = list.listIterator();
        LinkedList<Integer> newlist = new LinkedList<>();
        while(it.hasNext()){
            it.next();
        }
        while(it.hasPrevious()){
            newlist.add(it.previous());
        }
        System.out.println(list);
        System.out.println(newlist);
        System.out.println(list.equals(newlist)?"It's Palindrome":"Not Palindrome");
    }
}
