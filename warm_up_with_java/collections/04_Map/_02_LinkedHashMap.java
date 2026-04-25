/*
Grocery Product Price List
key: product name
value: price
*/

// LinkedHashMap keeps insertion order

import java.util.*;
import java.io.*;
public class _02_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Double> priceMap= new LinkedHashMap<>();
        //LinkedHashMap keeps insertion order

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many products? =");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i< n; i++){
            System.out.print("\nEnter product ID: ");
            String product= sc.nextLine();

            System.out.print("Price: ");
            double price= sc.nextDouble();
            sc.nextLine();

            priceMap.put(product, price);
        }

        System.out.println("\nProduct price List: ");
        for(Map.Entry<String, Double> entry: priceMap.entrySet()){
            System.out.println(entry.getKey()+ "=>"+ entry.getValue());
        }

        System.out.println("\n Check product price: ");
        String item= sc.nextLine();
        if(priceMap.containsKey(item)){
            System.out.println(item+ "price => "+ priceMap.get(item));
        }else{
            System.out.println("Product not found,");
        }

        sc.close();    
    
    }
}
