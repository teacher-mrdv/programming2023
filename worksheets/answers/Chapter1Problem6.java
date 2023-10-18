public class Chapter1Problem6 // 1.6
{
	public static void main (String args[])
	{	// Initialize variables
		int first  = IBIO.inputInt("1st term in the sequence: ");
		int	second = IBIO.inputInt("2nd term in the sequence: ");
		int next   = 0;
		IBIO.output( first );			// Print first and second terms
		IBIO.output( second );
		for (int i = 1; i < 18; i++)	// Loop for the next 18 terms
		{
			next = first + second;		// Next term is sum of previous two
			IBIO.output( next );		// Print it out
			first  = second;			// Second term becomes next first
			second = next;				// Sum becomes the next second term
		}
	}
}