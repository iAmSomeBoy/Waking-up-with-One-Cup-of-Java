//LinkedList
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> a1= new LinkedList<String>(); //Creating linked list
        a1.add("Rachit"); //adding elements
        a1.add("Rahul");
        a1.add("Ratul");
        Iterator<String> itr= a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
