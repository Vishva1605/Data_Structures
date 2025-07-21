package Iterator;
import java.util.*;
public class SortElemntsLength{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("apple","dog","cat","name"));
        list.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(list);
    }
}
