package ArrayList;
import java.util.*;
public class ArraylistSplit {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int k = 3;
        ArrayList<ArrayList<Integer>> parts = new ArrayList<>();
        int n = list.size();
        if(n%k!=0){System.out.println("Split not Possible"); return;}
        int d = n/k;
        for(int i=0;i<list.size();i+=d){
            ArrayList<Integer> subList = new ArrayList<>(list.subList(i,i+d));
            parts.add(subList);
        }
        System.out.print(parts);
    }
}
