package LinkedList;
import java.util.*;
public class RemoveSecondElement {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        Solution s = new Solution();
        System.out.println("Original List : "+list);
        System.out.println("Altered List : "+s.removeSecondElement(list));

    }
}
// class Solution{
//     public LinkedList<Integer> removeSecondElement(LinkedList<Integer> list){
//         for(int i=1;i<list.size();i+=2){
//             list.remove(i);
//             i--;
//         }
//         return list;
//     }
// }
class Solution{
    public LinkedList<Integer> removeSecondElement(LinkedList<Integer> list){
        Iterator<Integer> it = list.iterator();
        boolean remove = false;
        while(it.hasNext()){
            it.next();
            if(remove)
                it.remove();
            remove = !remove;
        }
        return list;
    }
}
