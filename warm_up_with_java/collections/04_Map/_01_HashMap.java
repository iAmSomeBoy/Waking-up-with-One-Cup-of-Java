//Map will work with pair elements
//Map<String, Iteger> pair
//Map<Key-type, Value-type>
//Every key items will be unique->duplicate not allowed or ignored


import java.util.*;
import java.io.*;
public class _01_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> marks= new HashMap<>();
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter how many student records? ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i= 0; i<n; i++){
            System.out.print("Enter Student ID:");
            String id= sc.nextLine();
            
            System.out.print("Enter Marks: ");
            int score= sc.nextInt();
            sc.nextLine();
            marks.put(id, score);//if same id comes again, value gets updated
        }
        System.out.println("All records: "+ marks);

        System.out.println("Search student ID: ");
        String findId= sc.nextLine();
        if(marks.containsKey(findId)){
            System.out.println("Marks: "+ marks.get(findId));

        }else{
            System.out.println("ID Not Found.");

        }

        System.out.println("Enter ID to remove: ");
        String removedId= sc.nextLine();
        Integer removed= marks.remove(removedId);

        if(removed != null ){
            System.out.println("Removed record of"+ removedId);

        }else{
            System.out.println("ID not found, nothing removed");

        }

        System.out.println("Updated records: "+ marks);
        sc.close();

        

    }
}
