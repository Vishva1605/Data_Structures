package Iterator;

import java.util.*;

public class TraverseFromLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            it.next();
        }
        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
        
    
