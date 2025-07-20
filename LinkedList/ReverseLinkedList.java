package LinkedList;
import java.util.*;
public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.reverse(list);
        System.out.println(list);
    }
}
