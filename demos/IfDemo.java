/*
 * Demonstration of if/else if/else and counting inputs
 * excluding a rogue value
 * 
 */


public class IfDemo
{
	
	public static void main (String[] args)
	{
		int n = 0;
		int positives = 0; // also, -1 // pre-count adjustment
		int negatives = 0;
		int zeroes    = 0;
		
		do
		{
			n = IBIO.inputInt("Enter an integer: ");
			// if( n != 666 ) ...
			if(n < 0)
			{
				negatives++;
			} else if(n > 0)
			{
				positives++;
			} else
			{
				zeroes++;
			}
			/*if( n == 666 )
			{	positives--;
			} */
		} while(n != 666);
		positives--; // post count-adjustment
		//System.out.printf("Negatives: %d; Positives: %d; Zeroes: %d \n", negatives, positives, zeroes);
		System.out.printf("Negatives: " + negatives + "; Positives: " + positives + "; Zeroes: " + zeroes);
		
			
	}
}

