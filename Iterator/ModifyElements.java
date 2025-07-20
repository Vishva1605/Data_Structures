package Iterator;
import java.util.*;
public class ModifyElements {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("C","C++","Java","C#"));
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String str = it.next().toLowerCase();
            if(str.equals("java")){
                it.set("Python");
            }
        }
        System.out.println(list);
    }
}
