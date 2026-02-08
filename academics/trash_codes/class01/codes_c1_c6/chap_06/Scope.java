package academics.class01.codes_c1_c6.chap_06;
class Scope
{
	String txt = "This is a global variable of the Scope class";

	public static void main ( String[] args )
	{
		String txt = "This is a local variable in the main method";
		System.out.println( txt );
		sub();

		//System.out.println( Scope.txt );
	}

	public static void sub( )

	{	
		String txt = "This is a local variable in the sub method";	
		System.out.println( txt );
	}
}
