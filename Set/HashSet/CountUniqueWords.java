
import java.util.HashSet;
public class CountUniqueWords {
    public static void main(String[] args){
        String input = "Java is Java and Java is powerful";
        String[] str = input.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String s : str){
            set.add(s);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
