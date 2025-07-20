package LinkedList;
import java.util.*;
public class RotateLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int k = 2;
        k = k%list.size();
        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.addAll(list.subList(k,list.size()));
        newlist.addAll(list.subList(0,k));
        System.out.println("Original List : "+list);
        System.out.println("Rotated List : "+newlist);
    }
}
