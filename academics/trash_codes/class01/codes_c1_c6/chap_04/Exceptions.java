package academics.class01.codes_c1_c6.chap_04;
class Exceptions
{
	public static void main( String[] args )
	{
		try
		{
			int num = Integer.parseInt(args[0]);
			System.out.println( "You entered: "+num );		
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println( "Integer argument required.");	
		}
		catch( NumberFormatException e ) 
		{
			System.out.println( "Argument is wrong format.");
		}
		finally
		{
			System.out.println( "Program ends." );
		}
	}
}
