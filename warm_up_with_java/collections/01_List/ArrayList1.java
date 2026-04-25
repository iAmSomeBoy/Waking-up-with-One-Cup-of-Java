import java.util.*;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> arrList= new ArrayList<>(); //Create ArrayList of String Data-type

        //add elements
        arrList.add("Cricket");  //arrList[Cricket]
        arrList.add("Hockey");  //arrList[Cricket, Hockey]

        //add by index
        arrList.add(0, "Basketball");  //arrList[Criket, Hockey, Basketball]

        System.out.println("ArrayList Elements: ");
        //Travering ArrayList using for loop
        for(String str: arrList){
            System.out.println(str);
        }

    }
}
