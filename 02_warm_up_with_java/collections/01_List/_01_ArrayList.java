import java.util.*;
import java.io.*;

public class _01_ArrayList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        /*
        = List, Set, Map, Queue are interfaces
        = let assume them as level of day-laybor: like 1st class= List, 2nd class= Set etc
        = List is as we take 1st class laybor
        = <String> is for the laybor who works with strings
        = list is the name of our laybor group
        = new is as we create new group
        = ArrayList is for meaning(filtering) the laybors of List who are ordered and duplicatable
                    
        */

        System.out.println("Enter number of laybors :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();    //but nextInt() creates a newline automatically
        sc.nextLine(); // so to consume leftover newline after nextInt() use sc.nextLine()

        System.out.println("Enter laybors name: ");
        for(int i=0; i< n; i++){
            String layborName= sc.nextLine();
            list.add(layborName);
        }

        System.out.println("Laybor List: "+ list);

        /*
        + we can also add new elements: list.add("value"), list.add(index, "value")
        + remove elements by index, by exact value:  list.remove(i), list.remove("value");
        + search value  //
        + print specific indexed value(0-based index): list(i);
        + we can get its size(number of elements): list.size()
        
        */
        System.out.print("Enter name to search: ");
        String findName= sc.nextLine();
        if(list.contains(findName)){
            System.out.println("Name found at index of " + list.indexOf(findName));
        }else{
            System.out.println("Name not found");
        }

        System.out.println("Add new laybor: ");
        int m;
        System.out.println("Enter how many new laybor do you want to add");
        m= sc.nextInt();
        sc.nextLine();  //for extra line consumed

        System.out.println("Enter new laybor name: ");
        int jj= list.size();
        for(int j= jj ; j< (jj+ m); j++ ){
            String layborName2= sc.nextLine();
            list.add(layborName2);

        }
        sc.close();
    }
}

//ctr+ shift+ p=> disable cursor tab
