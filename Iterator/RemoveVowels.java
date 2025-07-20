package Iterator;
import java.util.*;
public class RemoveVowels {
    public static void main(String[] args){
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('a','t','v','p','u','y'));
        Iterator<Character> it = list.iterator();
        while(it.hasNext()){
            char ch = it.next();
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
