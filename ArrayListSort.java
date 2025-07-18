import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("Sorted List : "+list);
        sc.close();
    }
}