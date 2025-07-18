import java.util.*;
public class ArrayListPalindrome {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,3,4,3,2,1));
        boolean result = list.reversed()==list?true:false;
        System.out.println(list+"\n"+result);
    }
}
