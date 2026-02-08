package academics.class01.codes_c1_c6.chap_05;
class StringComparison
{
	public static void main( String[] args )
	{
		String password = "bingo";

		try
		{
			if( args[0].toLowerCase().equals(password) ) 
			{
				System.out.println( "Password accepted." );
			}
			else 
			{
				System.out.println( "Incorrect password." );
			}
		}
		catch(Exception e) 
		{
			System.out.println( "Password required." );
		}
	}
}
