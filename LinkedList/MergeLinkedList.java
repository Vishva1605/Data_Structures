package LinkedList;
import java.util.*;
public class MergeLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,3,5,7,9));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2,4,6,8,0));
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.print(list1);
    }
}
