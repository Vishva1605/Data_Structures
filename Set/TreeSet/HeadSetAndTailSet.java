package Set.TreeSet;
import java.util.*;
public class HeadSetAndTailSet {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40,50));
        int num = 30;
        System.out.println(set.headSet(num));// num<30
        System.out.println(set.tailSet(num));// 30>=num
    }
}
