public class try_catch_multiple {
    public static void main(String args[]){
        try{
            int arr[]= new int[7];
            arr[4]= 30/0;
            System.out.println("Last statement of the try-block");
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit");
        }
        catch(Exception e){             //catch(Exception e) is generic exception catch block that kept in thelast
            System.out.println("Some other Exception");
        }

        System.out.println("Out of the try-catch block");
    }
}
