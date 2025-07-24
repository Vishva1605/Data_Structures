
import java.util.*;
public class MissingNumbers {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(2,4,5,3,2,3,4,5,1));
        HashSet<Integer> set2 = new HashSet<>();
        int n = 8;
        for(int i=1;i<=n;i++){
            set2.add(i);
        }
        set2.removeAll(set1);
        System.out.println(set2);
    }
}
