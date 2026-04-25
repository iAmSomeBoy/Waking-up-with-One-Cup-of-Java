/*
= Set is a collection where:
* no duplicate values allowed
* no index (get(0) নেই)
* mainly used for uniqueness checking
            Most common:
+ HashSet → fastest, no guaranteed order
+ LinkedHashSet → keeps insertion order
+ TreeSet → sorted order
*/

/*
Practical Example: Event Entry Gate
Imagine people enter an event and you collect their phone numbers.
Some people try to enter multiple times. You want unique visitors only.
Set is perfect for this.
*/

import java.io.*;
import java.util.*;
public class oneHashSet {
    public static void main(String[] args){

        Set<String> visitor= new HashSet<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("How many visitors do you want to allow today: ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i= 0; i< n; i++){
            System.out.println("Enter phone number: ");
            String phone= sc.nextLine();

            if(visitor.add(phone)){             //if we try to add duplicate it call exception handler here. so we avoid that by this
                System.out.println("Entry allowed !");
            }else{
                System.out.println("Duplicate visitor! Already entered.");
            }
        }

        System.out.println("Unique visitors today: "+ visitor);
        System.out.println("Total visitors: "+ visitor.size());

        //remove entry
        System.out.println("Enter a phone number to remove: ");
        String rNumber= sc.nextLine();
        if(visitor.remove(rNumber)){
            System.out.println("Removed Successfully! ");

        }else{
            System.out.println("Number not found! ");

        }
        
        System.out.println("Final visitor set: "+ visitor);



        sc.close();

    }
}
