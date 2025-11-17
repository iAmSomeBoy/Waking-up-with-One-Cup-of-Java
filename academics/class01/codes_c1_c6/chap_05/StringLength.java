package academics.class01.codes_c1_c6.chap_05;
class StringLength
{
	public static void main( String[] args )
	{
		String lang = "Java";

		String series = " in easy steps";

		String title = lang.concat( series );

		System.out.print( "\""+title + "\" has ");
		System.out.println( title.length()+" characters" );
	}
}
