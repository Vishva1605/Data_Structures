package Iterator;
import java.util.*;
public class PrintAllElements {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
