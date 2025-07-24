package Set.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class RemoveDupFromASentence {
    public static void main(String[] args){
        String s = "this is is a test test sentence";
        String[] str = s.split(" ");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(str));
        System.out.println(String.join(" ",set));
    }
}
