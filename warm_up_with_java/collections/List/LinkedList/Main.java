import java.util.*;

public class Main {
    public static void main(String[] args){
        LinkedList<String> linkedList= new LinkedList<>();

        linkedList.add("Apple");    //add elements ["Apple"]
        linkedList.add("Orange");    //["Apple", "Orange"]
        linkedList.add(0, "Banana");    //["Banana", "Apple", "Orange"]

        System.out.println("LinkedList elements: ");
        Iterator<String> it= linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
