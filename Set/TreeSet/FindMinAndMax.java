package Set.TreeSet;
import java.util.*;
public class FindMinAndMax {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(3,2,4,5,1,7,0,9,8));
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
