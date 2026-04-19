import java.util.*;
public class Main{
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();

        //add elments 
        stack.push("cloth1");   //["cloth1"]
        stack.push("cloth2");   //["cloth2", "cloth1"]
        stack.push("cloth3");   //["cloth3","cloth2","cloth1"]
        stack.push("cloth3");   //["cloth4","cloth3","cloth2","cloth1"]

        stack.pop();    //remove last element //["cloth3","cloth2","cloth1"]

        System.out.println("Stack elements: ");
        for(String str: stack){
            System.out.println(str);
        }

    }
}