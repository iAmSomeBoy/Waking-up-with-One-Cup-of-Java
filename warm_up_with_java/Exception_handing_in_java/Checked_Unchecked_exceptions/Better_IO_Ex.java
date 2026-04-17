import java.io.*;

public class Better_IO_Ex {
    public static void main(String[] args) {
        FileInputStream fis= null;
        try{
            fis= new FileInputStream("E:/work_place_CSE_2_1/JU CSE 2-1/Question Bank/ethics_tutorial.txt.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("The specified file is not present at the given path");

        }

        int k;
        try{
            while((k= fis.read())!= -1){
                System.out.println((char)k);
            }
            fis.close();
        }
        catch(IOException e2){
            System.out.println("Input Output error occurred:"+ e2);
        }




    }
}
