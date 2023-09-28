public class TracingHW4
{
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("N = ");
		int min = n;
		while( n > 0 )					// while n is positive...
		{
			if( n < min )
			{
				min = n;
			}							// end if
			n = IBIO.inputInt("N = ");
		}								// end of the while loop
		IBIO.output("Smallest number input = " + min);
	}
}

