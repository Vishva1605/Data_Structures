
import java.util.*;
public class FirstReapeatingCharacter {
    public static void main(String[] args){
        int[] arr = {4,5,6,3,5,2,4};
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for(int num : arr){
            if(!set.add(num)){
                result = num;
                break;
            }
        }
        System.out.println(result);
    }
}
