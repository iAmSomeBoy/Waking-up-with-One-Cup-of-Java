// ArrayList
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList a1= new ArrayList();
        a1.add("Jack");
        a1.add("Tyler");
        Iterator<String> itr= a1.iterator();   //itr interface type কিন্তু object ArrayList-এর internal Iterator class এর
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
