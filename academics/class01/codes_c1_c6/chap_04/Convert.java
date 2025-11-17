package academics.class01.codes_c1_c6.chap_04;
class Convert
{
	public static void main( String[] args )
	{
		float daysFloat = 365.25f;
		String weeksString = "52";

		int daysInt = (int) daysFloat;

		int weeksInt = Integer.parseInt( weeksString );

		int week = ( daysInt / weeksInt );

		System.out.println( "Days per week: " + week );
	}
}
