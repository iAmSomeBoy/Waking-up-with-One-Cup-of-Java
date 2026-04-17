import java.util.Scanner;

class UncheckedEx{
    public static void main(String[] args){
        
        int n;
        System.out.print("Enter the index: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.close();
        System.out.println();

        int arr[]={1, 3, 5, 7, 9};
        try{
            System.out.println(arr[n]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The given index doesn't exist.");
            System.out.println("Please try again with correct index");
        }

    }   
}