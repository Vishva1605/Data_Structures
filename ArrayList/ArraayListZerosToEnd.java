package ArrayList;
import java.util.*;
public class ArraayListZerosToEnd {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,0,2,3,0,4));
    int size = list.size();
    int count = 0;
    for(int i=0;i<size;i++){
        if(list.get(i)!=0){
            list.set(count,list.get(i));
            count++;
        }
    }
    while(count<size){
        list.set(count,0);
        count++;
    }
    // for(int i=0;i<list.size();){
    //     if(list.get(i)==0){
    //         list.remove(i);
    //         count++;
    //     }else{
    //         i++;
    //     }
    // }
    // for(int i=0;i<count;i++){
    //     list.add(0);
    // }
    System.out.println(list);
    }
}
