public class _3_TestBoats {
    public static void main(String[] args){
        Boat b1= new Boat();
        SailBoat b2= new SailBoat();
        RowBoat b3= new RowBoat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat{   //super class
    private int length;
    public void setLength(int len){
        length= len;
    }
    public int getLen(){
        return length;
    }

    public void move(){
        System.out.println("drift");
    }
}

class RowBoat extends Boat{   //inherites Boat class
    public void rowTheBoat(){
        System.out.println("stroke natasha");
    }
}

class SailBoat extends Boat{  //inherites Boat class
    public void move(){
        System.out.println("hoist sail"); //override;
    }
}
