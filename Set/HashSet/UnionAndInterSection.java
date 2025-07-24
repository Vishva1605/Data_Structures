
import java.util.*;
public class UnionAndInterSection {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,4,5};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
            temp.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : arr2){
            set2.add(num);
        }
        temp.addAll(set2);
        System.out.println("Union : "+temp);
        set1.retainAll(set2);
        System.out.println("Intersection : "+set1);
    }
}
