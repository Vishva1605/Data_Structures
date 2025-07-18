import java.util.ArrayList;
public class ArrayListPrintNames{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sanjai");
        list.add("Vijay");
        list.add("Ajith");
        list.add("Smith");
        list.add(2,"Vishva");
        System.out.println("List : "+list);
    }
}