import java.util.*;
public class FindAllDuplicatesInList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,2,7,8,2,3,1));
        ArrayList<Integer> duplist = new ArrayList<>();
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                if(!duplist.contains(list.get(i))) duplist.add(list.get(i));
            }
        }
        System.out.println(duplist);
    }
}
