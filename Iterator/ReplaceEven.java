package Iterator;
import java.util.*;
public class ReplaceEven {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        ListIterator<Integer> it = list.listIterator();
        LinkedList<String> newlist = new LinkedList<>();
        while(it.hasNext()){
            int n = it.next();
            if(n%2==0){
                newlist.add("Even");
            }else{
                newlist.add(n+"");
            }
        }
        System.out.println(newlist);
    }
}
