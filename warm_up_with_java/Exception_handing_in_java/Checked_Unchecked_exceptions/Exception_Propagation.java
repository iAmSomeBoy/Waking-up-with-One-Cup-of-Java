/*
Exception propagation is a process by which compiler ensures that
the exception is handled somewhere(possibly in the caller function or somewhere else),
if it is not handled where the exception occurs.
*/

import java.util.jar.JarEntry;

public class Exception_Propagation {

    int calculateQuotient(int num1, int num2){
        int temp= num1/num2;  //if num2 comes 0,error(exception comes)but no exception handler here. 
        return temp;          //So this exception will be propagated to its caller function
    }
    void printQuotient(int num1, int num2){
        try{
            int q= calculateQuotient(num1, num2);
            System.out.println("Quotient is: "+ q);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurredd");
        }
    }
    
    public static void main(String[] args){
        int num1= 10, num2= 0;

        Exception_Propagation obj= new Exception_Propagation();
        obj.printQuotient(num1, num2);
    }
}
