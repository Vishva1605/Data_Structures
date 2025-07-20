package ArrayList;
import java.util.*;
public class ArrayListRemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        System.out.println("Original List : "+ list);
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!uniqueList.contains(list.get(i))){
                uniqueList.add(list.get(i));
            }
        }
        System.out.println("Removed Duplicate : "+ uniqueList);
    }
}