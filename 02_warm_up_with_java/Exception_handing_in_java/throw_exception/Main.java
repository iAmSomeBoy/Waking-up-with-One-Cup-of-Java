import java.io.*;
class Throw_example2 {
        void myMethod(int num) throws IOException, ClassNotFoundException{
            if(num==1)
                throw new IOException("IOExcetion Occured");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
}

public class Main{
    public static void main(String[] args) {
        try{
            Throw_example2 obj= new Throw_example2();
            obj.myMethod(1);

        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}


