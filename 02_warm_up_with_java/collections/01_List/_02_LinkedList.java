/*
Vector vs LinkedList (simple view)
# Vector
- dynamic array (like ArrayList)
- synchronized (thread-safe, slower in single-thread apps)
- keeps insertion order
- allows duplicates

# LinkedList
- doubly linked structure
- fast add/remove at beginning or middle (when node known)
- slower random access (get(i)) than array-based lists
- also works as Queue/Deque
*/


/*
    queue system: In a restaurent the first cumtomer will be served first;
    and If we want to track the first and last customers, we should use LinkedList as it is 
*/

import java.util.*;
import java.io.*;

public class _02_LinkedList {
    public static void main(String[] args){
        
        LinkedList<String> queue= new LinkedList<>();
        //List<String> queue= new LinkdList<>() is possible but as we use addFist(), etc related to LinkedList. 
        // we only use List<String> when solely its method is need. but here we use more
        Scanner sc= new Scanner(System.in);

        System.out.print("How many customers arrive?: ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i= 0; i< n; i++){
            System.out.print("Enter customer name: ");
            String name= sc.nextLine();
            queue.add(name);
        }
        System.out.println("Current queue: "+ queue);

        //Serve first customer
        if(!queue.isEmpty()){
            String served= queue.removeFirst();
            System.out.println("Now serving: "+ served);
        }

        System.out.println("Enter VIP name: ");
        String vip = sc.nextLine();
        queue.addFirst(vip);

        System.out.print("Updated queue:"+ queue);
        sc.close();
    }
}
