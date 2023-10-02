/*
 * Problem 1 from Chapter 1
 * Change the program so that you enter in a number and then the program will print your name down the screen that number of times.
 */


public class Chapter1Problem1
{
	
	public static void main (String[] args)
	{
		int number = IBIO.inputInt("How many times? ");
		for(int i = 0; i < number; i++)
		{
			IBIO.output("Marcos");
		}
	}
}

/* program output:

How many times? 3
Marcos
Marcos
Marcos
*/
