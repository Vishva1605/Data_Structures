package ArrayList;
import java.util.*;
public class RotateArrayListByKTimes {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 2;

        rotateArrayList(list,k);
    }
    public static void rotateArrayList(ArrayList<Integer>list,int k){
        ArrayList<Integer> newlist = new ArrayList<>();
        int n = list.size();
        k = k%n;
        newlist.addAll(list.subList(n-k,n));
        newlist.addAll(list.subList(0,n-k));
        // for(int i=list.size()-k;i<list.size();i++){
        //     newlist.add(list.get(i));
        // }
        // for(int i=0;i<list.size()-k;i++){
        //     newlist.add(list.get(i));
        // }
        System.out.println(newlist);
    }
}

