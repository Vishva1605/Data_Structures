package Queue.queue;
import java.util.*;
public class PrinterQueue {
    static Queue<String> q = new LinkedList<>();
    public static void addDocument(String s){
        q.add(s);
    }
    public static void printNextDocument(){
        System.out.print(q.poll()+" ");
    }
    public static void viewNextDocument(){
        System.out.print(q.peek()+" ");
    }
    public static void main(String[] args){
        Queue<String> Queue = new LinkedList<>(Arrays.asList("Doc1","Doc2","Doc3","Doc4","Doc5"));
        for(String s : Queue){
            addDocument(s);
        }
        int n = Queue.size();
         while(n != 0){
            viewNextDocument();
            n--;
        }
        System.out.println();
        n = Queue.size();
        while(n != 0){
            printNextDocument();
            n--;
        }
    }
}
