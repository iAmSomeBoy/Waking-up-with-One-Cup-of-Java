public class ArithmeticEx {
    public static void main(String[] args){
        try{
            int num1= 30;
            int num2= 0;
            int output= num1/num2;
            System.out.println("Result: "+output);
        }
        catch(ArithmeticException any_obj){
            System.out.println("YOu shouldn't divide a number by zero");
        }
    }
}
