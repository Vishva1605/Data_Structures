package Iterator;
import java.util.*;
class RemoveElements{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("apple","banana","cat","dog","elephant","Umbrella"));
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            char ch = it.next().toLowerCase().charAt(0);
            if(ch == 'a'||ch =='e'||ch == 'i'||ch == 'o'||ch == 'u'){
                it.remove();
            }
        }
        System.out.println(list);
    }
}