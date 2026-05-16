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
# When to use
+ Use Vector when:
we specifically need legacy synchronized list behavior
or we are learning older Java collection classes
#Use LinkedList when:
many insert/delete operations
queue-like operations (addFirst, removeFirst, addLast)
*/

// (classroom attendance with name)
import java.util.*;
import java.io.*;
public class _03_Vector{
    public static void main(String[] args) {
        List<String> attendence= new Vector<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("How many students: ");
        int n;
        n= sc.nextInt();
        sc.nextLine();

        for(int i= 0; i <n; i++){
            System.out.println("Enter student names: ");
            String name= sc.nextLine();
            attendence.add(name);

        }
        System.out.print("Attendance list: "+ attendence);
        
        //Search a name
        System.out.print("Search name: ");
        String find= sc.nextLine();
        if(attendence.contains(find)){
            System.out.println("Found at index: "+ attendence.indexOf(find));

        }else{
            System.out.println("Not found");

        }

        System.out.print("Remove a name: ");
        String rm= sc.nextLine();
        boolean removed= attendence.remove(rm);
        System.out.println(removed? "Removed": "Name Not Found!");

        System.out.println("Updated attendance: "+ attendence);
        sc.close();
    }
}
