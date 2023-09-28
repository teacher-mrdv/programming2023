public class TracingHW2
{
	
	public static void main (String[] args)
	{									// = or <- for variable assignment
		int times = 5;					// TIMES = 5
		double sum  = 0;				// declare SUM as double/float = 0
		int counter = 0;				// COUNTER = 0
		while( counter < times )		// loop while COUNTER < TIMES
		{	int n = IBIO.inputInt("N = ");	// input N (with prompt)
			sum = sum + n;				// SUM = SUM + n
			counter = counter + 1;		// COUNTER = COUNTER + 1
		}								// end loop
		IBIO.out("Average = ");			// optional message
		IBIO.output(sum/counter);		// output SUM/COUNTER
	}
}

