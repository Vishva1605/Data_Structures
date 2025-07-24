
import java.util.HashSet;
public class CheckCommonElements {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,3,9};
        HashSet<Integer> list = new HashSet<>();
        for(int num:arr1){
            list.add(num);
        }
        boolean found = false;
        for(int num:arr2){
            if(list.contains(num)){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
