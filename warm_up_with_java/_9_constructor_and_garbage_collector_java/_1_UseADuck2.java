public class _1_UseADuck2 {
    public static void main(String args[]){
        Duck d= new Duck(42);
    }
}

class Duck{
    int size;
    public Duck(int duckSize){  //constructor with arguments
        System.out.println("Quack");
        size= duckSize;
        System.out.println("size is "+ size);
    }
}
