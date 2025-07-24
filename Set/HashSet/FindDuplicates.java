
import java.util.HashSet;
public class FindDuplicates {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1,4,5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for(int num:arr){
            // if(seen.contains(num)){
            //     dup.add(num);
            // }
            // seen.add(num);
            if(!seen.add(num)){
                dup.add(num);
            }
        }
        System.out.println(dup);
    }
}
