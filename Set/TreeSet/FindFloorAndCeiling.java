package Set.TreeSet;
import java.util.*;
public class FindFloorAndCeiling {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,29,30,2,50));
        int num = 25;
        System.out.println(set.floor(num));
        System.out.println(set.ceiling(num));
    }
}
