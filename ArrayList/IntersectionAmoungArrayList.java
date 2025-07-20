package ArrayList;
import java.util.*;
public class IntersectionAmoungArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,6,7,8,9));
        list1.retainAll(list2);
        System.out.println(list1);
        // list1.removeAll(list2);
        // System.out.println(list1);
    }
}
