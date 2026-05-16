import javax.crypto.AEADBadTagException;

public class ThrowExample {
    static void checkEligibility(int studentAge, int studentWeight){
        if(studentAge<12 && studentWeight<40){
            throw new ArithmeticException("Student is not eligible for registration");

        }
        else{
            System.out.println("Student Entry is valid");
        }
    }

    public static void main(String args[]){
        System.out.println("Welcome to the Registration process!!");
        checkEligibility(10, 39);
        System.out.println("Have a nice day...");
    }
}
