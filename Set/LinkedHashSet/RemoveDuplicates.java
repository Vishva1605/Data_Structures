package Set.LinkedHashSet;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {4,5,4,1,2,5,3};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
