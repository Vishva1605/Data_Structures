
import java.util.*;
public class FindAllPairsInArray {
    public static void main(String[] args){
        int[] arr = {2,4,3,7,5,-1};
        int sum = 6;
        HashSet<Integer> set = new HashSet<>();
        // for(int num : arr) set.add(num);
        // for(int i=0;i<arr.length;i++){
        //     int n = arr[i];
        //     int diff = Math.abs(sum-n);
        //     if(set.contains(diff)){
        //         System.out.print("("+arr[i]+", "+diff+")");
        //     }
        // }
        for(int num : arr){
            int diff = sum - num;
            if(set.contains(diff)){
                System.out.print("("+num+", "+diff+")");
            }
            set.add(num);
        }
    }
}
