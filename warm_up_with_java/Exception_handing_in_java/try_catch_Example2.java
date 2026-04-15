public class try_catch_Example2 {
    public static void main(String[] args) {
        try{
            int[] a= new int[7];
            a[4]= 30/0;
            System.out.println("try block's statement");

        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutofBoundException");
        }
        catch(Exception e){
            System.out.println("Warning: Some other exception");
        }

        System.out.println("Out of try-catch block");
        
    }
}
