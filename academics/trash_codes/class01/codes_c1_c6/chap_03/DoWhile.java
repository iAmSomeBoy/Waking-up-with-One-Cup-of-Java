package academics.class01.codes_c1_c6.chap_03;
class DoWhile
{
	public static void main( String[] args )
	{	
		int num = 10 ;

		do
		{
			System.out.println( "DoWhile Countup: " + num );	
			num += 10;
		}
		while ( num <= 100 );		
	}
}
