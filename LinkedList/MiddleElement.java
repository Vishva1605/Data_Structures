package LinkedList;
import java.util.*;
public class MiddleElement {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,0,4,5,6,7,8,9,0));
        int mid = list.lastIndexOf(list.getLast())/2;
        System.out.println(list.get(mid));
    }
}
