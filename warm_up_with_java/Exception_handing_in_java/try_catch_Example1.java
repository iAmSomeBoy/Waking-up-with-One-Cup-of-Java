public class try_catch_Example1{
    public static void main(String[] args){
        int num1, num2;
        try{
            num1= 0; num2= 50/num1;
            System.out.println(num2);
            System.out.println("Last line of try block");

        } catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero");

        }
        catch(Exception e){
            System.out.println("Exception occured");
        }

        System.out.println("I'm out of try-catch block in java");
    }
}