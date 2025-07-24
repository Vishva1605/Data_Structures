package Set.LinkedHashSet;
import java.util.LinkedHashSet;
public class ReadIntegers {
    public static void main(String[] args){
        int[] nums = {10,20,30,20,10,40};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set);
    }
}
