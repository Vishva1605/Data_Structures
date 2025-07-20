package ArrayList;
import java.util.ArrayList;
public class ArrayListReplaceColor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.set(2,"Orange");
        System.out.println("Colors : "+list);
    }
}
