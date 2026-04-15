public class Try_catch_finally {
    public static void main(String[] args) {
        try{
            int num= 121/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("NUmber should not be divided by zero");

        }

        /* finally block will always executed
         * even if there is no execution in try block
         */
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }
}
