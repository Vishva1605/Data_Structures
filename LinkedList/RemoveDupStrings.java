package LinkedList;
import java.util.*;
public class RemoveDupStrings {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("apple","ball","cat","ball","Apple","grape"));
        LinkedList<String> newList = new LinkedList<>();
        for(int i=0;i<list.size();i++){
            String str = list.get(i).toLowerCase();
            if(!newList.contains(str)){
                newList.add(str);
            }
        }
        System.out.println(newList);
    }
}
