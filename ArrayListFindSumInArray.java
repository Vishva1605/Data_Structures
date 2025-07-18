import java.util.*;
public class ArrayListFindSumInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the Number Of Elements You Want To add in a List : ");
        int num = sc.nextInt();
        System.out.println("Enter the Elements : ");
        for(int i=0;i<num;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter the Target : ");
        int target = sc.nextInt();
        int res = target - list.get(0);
        if(list.contains(res)) System.out.println("Answers : ["+list.get(0)+","+res+"]");
        else System.out.println("No Match Found");
        sc.close();
    }
}
