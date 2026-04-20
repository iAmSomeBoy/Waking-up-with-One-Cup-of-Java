import java.util.*;

public class Main {
    public static void main(String[] args){
        Vector<String> v= new Vector<>();
        v.add("item1");   //["item1"]
        v.add("item2");     //["item1", "item2"]
        v.add(0,"item3");   //["item1", "item2", "item3"]

        Iterator<String> itr= v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); //print
        }

    }
}
