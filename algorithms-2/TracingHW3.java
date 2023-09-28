public class TracingHW3
{
	
	public static void main (String[] args)
	{
		int counter = 1;
		int factors = 0;
		int n = IBIO.inputInt("N = ");
		while(counter <= n)
		{
			if( n % counter == 0 )		// == in Java means comparison; = means assignment, <-
			{
				IBIO.out(" " + counter);// output the factors (optional)
				factors++;				// abbreviation of factors = factors + 1
			}							// end if
			counter++;					// abbreviation of counter = counter + 1
		}								// end of the while loop
		IBIO.output("");
		IBIO.output(n + " has " + factors + " factors");
	}
}

