package LinkedList;
import java.util.*;
public class InsertAtIndex {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("apple","banana","mango","orange"));
        list.add(2,"grapes");
        System.out.println(list);
    }
}
