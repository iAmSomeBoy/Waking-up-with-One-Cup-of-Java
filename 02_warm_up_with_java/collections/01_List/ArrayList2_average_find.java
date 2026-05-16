import java.util.*;

public class ArrayList2_average_find{

    public static double calculateAvg(ArrayList<Integer> list){
        if(list== null || list.isEmpty()){
            return 0;
        }
        double sum= 0;
        for(int number: list){
            sum += number;
        }

        return(sum/list.size());
    }
    public static void main(String[] args){
        ArrayList<Integer> number= new ArrayList<>();
        number.add(20);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(45);

        // call method for average;
        double average= calculateAvg(number);

        System.out.println("Average is: "+ average);
    }
}
