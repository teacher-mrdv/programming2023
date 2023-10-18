/*
 * Chapter 1, Problem 2
 * Write a program that allows you to input the number of steps, the starting point and the increment and then prints out your sequence.
 * So for example step = 4, start = 3, increment = 2. Then the sequence will be 3 5 7 9.
 * 
 */


public class Chapter1Problem2
{
	
	public static void main (String[] args)
	{
		int start = IBIO.inputInt("Enter starting number: ");
		int increment = IBIO.inputInt("Enter increment: ");
		int steps = IBIO.inputInt("Enter the number of steps (repetitions): ");
		int sequence = start;
		
		for(int i = 0; i < steps; i++) // repeat...
		{
			IBIO.out(sequence + " ");
			sequence = sequence + increment;
		}
		IBIO.output("\nBye!");
	}
}

/* Output *

Enter starting number: 3
Enter increment: 2
Enter the number of steps (repetitions): 4
3 5 7 9 
Bye!

*/

