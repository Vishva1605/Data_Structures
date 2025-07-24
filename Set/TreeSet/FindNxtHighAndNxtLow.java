package Set.TreeSet;
import java.util.TreeSet;
import java.util.Arrays;
public class FindNxtHighAndNxtLow {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40,50));
        int num = 25;
        System.out.println("Lower of "+num+" : "+set.lower(num)+"\n"+"Higher of "+num+" : "+set.higher(num));
    }
}
