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

        try{
            if (fis != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
                br.close();
            }
        }
        catch(IOException e2){
            System.out.println("Input Output error occurred:"+ e2);
        }




    }
}
