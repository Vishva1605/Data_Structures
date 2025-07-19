import java.util.*;

public class LeaderElementInArraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        ArrayList<Integer> leaders = new ArrayList<>();

        int n = list.size();
        int maxFromRight = list.get(n - 1);
        leaders.add(maxFromRight);  // Last element is always a leader

        for(int i = n - 2; i >= 0; i--) {
            if(list.get(i) > maxFromRight) {
                maxFromRight = list.get(i);
                leaders.add(maxFromRight);
            }
        }

        // Reverse to maintain left-to-right order
        Collections.reverse(leaders);
        System.out.println("Leader elements: " + leaders);
    }
}
