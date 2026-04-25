/*
+ VIP + Normal Customer Line
- VIP enters at front
- normal customer enters at back
- service from front
*/

import java.util.*;
import java.io.*;
public class _02_VIPDeque{
    public static void main(String[] args){
        Deque<String> customers= new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many normal customers: ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0; i< n; i++){
            System.out.print("Enter normal customer name: ");
            customers.offerLast(sc.nextLine());

        }

        System.out.print("Enter VIP name: " );
        String vip= sc.nextLine();
        customers.offerFirst(vip);

        System.out.println("Line now: "+ customers);
        System.out.println("Now serving: "+ customers.pollFirst());
        System.out.println("Remaining line: "+ customers);
        sc.close();
    }
}
