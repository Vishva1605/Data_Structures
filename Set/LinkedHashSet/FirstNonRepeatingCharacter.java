package Set.LinkedHashSet;
import java.util.LinkedHashSet;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String s = "swiss";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        LinkedHashSet<Character> dup = new LinkedHashSet<>();
        for(char ch : s.toCharArray()){
            if(!set.add(ch)){
                dup.add(ch);
            }
        }
        char result = '\0';
        for (char ch : set) {
            if (!dup.contains(ch)) {
                result = ch;
                break;
            }
        }
        System.out.println(result == '\0' ? "None" : result);
    }
}
