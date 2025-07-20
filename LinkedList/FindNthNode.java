package LinkedList;
import java.util.*;
public class FindNthNode {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,3,4,5,1,6,7,9,0,8));
        int k = 4;
        System.out.println(list.get(list.size()-k));
    }
}
