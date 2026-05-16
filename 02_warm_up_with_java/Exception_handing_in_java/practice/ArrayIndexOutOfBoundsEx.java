public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args){
        try{
            int a[]= new int[10];
            a[11]= 100;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBounds Exception Occurred");
            System.out.println("System Message: "+ e);
        }
    }
}
