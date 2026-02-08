package academics.class01.codes_c1_c6.chap_06;
class SuperClass
{
	public static void hello()
	{
		System.out.println( "Hello from the Super Class" );
	}

	public static void echo(String arg )
	{
		try
		{
		
			System.out.println( "You entered: " + arg );
		}
		catch(Exception e)
		{
			System.out.println( "Argument required" );
		}
	}
}

