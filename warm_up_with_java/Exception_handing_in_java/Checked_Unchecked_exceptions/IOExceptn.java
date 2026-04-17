import java.io.*;

public class IOExceptn{
    public static void main(String[] args) throws IOException{
        FileInputStream fis= null;
        fis= new FileInputStream("E:/work_place_CSE_2_1/JU CSE 2-1/Question Bank/ethics_tutorial.txt.txt");
        int k;
        
        
        while((k= fis.read()) != -1){
            System.out.println((char)k);
        }

        fis.close();
    }
}
