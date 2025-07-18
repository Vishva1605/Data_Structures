import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistFruitCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("PineApple");
        list.add("Orange");
        System.out.print("Enter the Fruit Name : ");
        String Fruit = sc.nextLine();
        if(list.contains(Fruit))
            System.out.println("Yes The Fruit is present in a List");
        else
            System.out.println("Fruit Not present in a List");
        sc.close();
    }
}
