/*
 * MockTestQ1
 */


public class MockTestQ1
{
	
	public static void main (String[] args)
	{
		IBIO.output("Marcos Drien");
		
		int terms = IBIO.inputInt("Up to term: ");
		
		do
		{
			while(terms < 0)
			{	IBIO.output("Error - enter a positive");
				terms = IBIO.inputInt("Up to term: ");
			}
			long prev = 0; // term 0
			long next = 1; // term 1
			long fibo = 0;
			double average = prev+next;
			if( terms <= 20)
			{	IBIO.out(prev + "; " + next);
			}
			for(int i = 2; i < terms; i++)
			{	
				fibo = prev + next;
				average = average + fibo;
				if(terms <= 20)
				{	IBIO.out("; " + fibo);
				}
				prev = next;
				next = fibo;
			}
			fibo = prev + next; // calculate last term only
			average = average + fibo;
			if(terms <= 20)
			{	IBIO.out("; ");
			}
			IBIO.output(fibo);
			IBIO.output("Average: " + (average/terms) );
			long n = fibo;
			int digitCounter = 0;
			do
			{	n = n / 10;
				digitCounter = digitCounter + 1;
			} while(n != 0);

			IBIO.output(fibo + " has " + digitCounter + " digits");
			terms = IBIO.inputInt("Up to term: ");
		} while( terms != 0 );
	}
}

