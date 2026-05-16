/*
When to use:
- no duplicate
- need to keep the same order of data entryed
*/

/*
Real scenario
Website newsletter signup
we store emails. Duplicate emails should be ignored,
and we want to show signup list in the same order people registered.
*/


import java.util.*;
import java.io.*;
public class two_LinkedHashSet {
    public static void main(String[] args){
        Set<String> emails= new LinkedHashSet<>();

        Scanner sc= new Scanner(System.in);
        System.out.print("ENter how many email signup allowed: ");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i= 0; i< n; i++){
            System.out.print("Enter Email: ");
            String email= sc.nextLine();

            if(emails.add(email)){
                System.out.println("Signup saved!");
            }else{
                System.out.println("Duplicate email ignored!");
            }

        }
        
        System.out.println("\n Signedup email list: "+ emails);
        System.out.println("Total unique eamils: "+ emails.size());
        sc.close();
    }
}
