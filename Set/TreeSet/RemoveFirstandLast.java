package Set.TreeSet;
import java.util.*;
public class RemoveFirstandLast {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Removed : "+set.removeFirst());
        System.out.println("Removed : "+set.removeLast());
        System.out.println(set);
    }
}
