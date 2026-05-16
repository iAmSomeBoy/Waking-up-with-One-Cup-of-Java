import java.util.*;
import java.io.*;

public class _01_BrowserDeque {
    public static void main(String[] args){
        Deque<String> histry= new ArrayDeque<>();
        Scanner sc= new Scanner(System.in);

        System.out.print("How many pages visited? : ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0; i< n; i++){
            System.out.print("Enter name of page: ");
            String page= sc.nextLine();
            histry.addLast(page);     //newest page adding back
        }

        System.out.println("Current histry: "+ histry);
        System.out.println("Oldest page: "+ histry.peekFirst());
        System.out.println("Latest page: "+ histry.peekLast());

        System.out.println("Press back button (to remove latest): "+ histry.pollLast());
        System.out.println("Updated histry: "+ histry);
        
       sc.close();
    }
}
