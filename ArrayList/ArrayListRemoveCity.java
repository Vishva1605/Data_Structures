package ArrayList;
import java.util.ArrayList;
public class ArrayListRemoveCity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Chennai");
        list.add("Mumbai");
        list.add("Banglore");
        list.add("Madurai");
        list.add("Theni");
        System.out.println("Cities "+list);
        list.remove(2);
        System.out.println("3rd City Removed : "+list);
    }
}
