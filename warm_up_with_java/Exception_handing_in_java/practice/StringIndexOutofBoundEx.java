public class StringIndexOutofBoundEx {
    public static void main(String[] args){
        try{
            String str= "walking up with one cup of java";
            System.out.println(str.length());
            char c= str.charAt(70);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException Occurred");
        }
    }
}
