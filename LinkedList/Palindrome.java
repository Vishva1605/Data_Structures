package LinkedList;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('a','b','c','d','c','b','a'));
        if(list.reversed()==list) System.out.println("Palindorme");
        else System.out.println("Not Palindorme");
    }
}
