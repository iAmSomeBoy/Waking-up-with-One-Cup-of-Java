public class _3_TestDuck {
    public static void main(String args[]){
        int weight= 8;
        float density= 2.4F;
        String name= "Donald";
        long[] feathers= {1, 2, 3, 4, 5, 6};
        boolean canFly= true;
        int airspeed= 22;

        Duck[] d= new Duck[7];
        d[0]= new Duck(); //calling 1st constructor 
        d[1]= new Duck(density, weight);
        d[2]= new Duck(name, feathers);
        d[3]= new Duck(canFly);
        d[4]= new Duck(3.3F, airspeed);
        d[5]= new Duck(airspeed, density);
        d[6]= new Duck(false);
    }
}

class Duck{
    private int kilos= 6;
    private float floatability= 2.1F;
    private String name= "Generic";
    private long[] feathers= {1, 2, 3, 4, 5, 6, 7};
    private boolean canFly= true;
    private int maxSpeed= 25;

    //different kinds of constructors
    public Duck(){
        System.out.println("type 1 duck");

    }
    public Duck(boolean fly){
        canFly= fly;
        System.out.println("type 2 duck");
    }
    public Duck(String n, long[] f){
        name= n;
        feathers= f;
        System.out.println("type 3 duck");

    }
    public Duck(int w, float f){
        kilos= w;
        floatability= f;
        System.out.println("type 4 duck");

    }
    public Duck(float density, int max){
        float ability= density;
        maxSpeed= max;
        System.out.println("type 5 duck");
    }
}
