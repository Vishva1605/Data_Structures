package Iterator;
import java.util.*;
public class InsertElement {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Java","C","C++","Python"));
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next().toLowerCase();
            if(str.equals("c++")){
                it.add("Ruby");
            }
        }
        System.out.println(list);
    }
}
