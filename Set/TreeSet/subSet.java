package Set.TreeSet;
import java.util.*;
public class subSet {
    public static void main(String[] args){
    TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40,50));
    System.out.println(set.subSet(20, 50));
    }
}
