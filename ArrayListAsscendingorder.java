import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListAsscendingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());       
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println("Aorted Array "+list);
        sc.close();
    }
}
