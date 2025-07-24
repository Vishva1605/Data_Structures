
import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] nums = {1,2,3,2,1,4,5};
        HashSet<Integer> list = new HashSet<>();
        for(int num : nums){
            list.add(num);
        }
        System.out.println(list);
    }
}
