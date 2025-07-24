package Set.LinkedHashSet;
import java.util.*;
public class RemoveElements {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> remove = new ArrayList<>(Arrays.asList(2,4));
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        list.removeAll(remove);
        set.addAll(list);
        System.out.println(set);
    }
}
