/*
* TreeSet (Unique + Sorted Order)

 Use when you need:
+ no duplicates
+ automatic sorting (ascending by default)
*/

/*
* Real Scenario
- Student attendance: Student give their roll numbers
- repeatedly automatically sorted roll list
*/



import java.util.*;
public class three_TreeSet {
    public static void main(String[] args){
        Set<Integer> rolls= new TreeSet<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number of Students in total: ");
        int n= sc.nextInt();
        for(int i= 0; i< n; i++){
            System.out.println("Enter roll numbers: ");
            int roll= sc.nextInt();
            rolls.add(roll); //duplicate value automatically ignored
        }

        System.out.println("Present students' rolls: "+ rolls);
        System.out.println("Total attendance: "+ rolls.size());
        sc.close();

    }

        
}
