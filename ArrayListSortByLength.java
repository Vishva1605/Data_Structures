import java.util.*;
public class ArrayListSortByLength {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple","a","banana","kiwi"));
        // Collections.sort(list,new Comparator<String>() {
        //     public int compare(String s1,String s2){
        //         return Integer.compare(s1.length(),s2.length());
        //     }
        // });
        list.sort((s1,s2)-> Integer.compare(s1.length(),s2.length()));
        System.out.println(list);
    }
}