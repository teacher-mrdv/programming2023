/* Chapter 3, Problem 4
 * Consider the sequence. If a number was even then the next number would be half of that number, if the number was not even then the next number would be got by multiplying that number by 3 and then adding 1. eg if 7 was the starting number then that number is odd so it is multiplied by 3 and 1 added to get 22, 7, 22, 11, 34. This sequence continues until it eventually arrives at 1. Write a program that will allow you to input a number and then it continues this sequence until it eventually arrives at 1. I want to know how many steps it takes. Eg starting at 3 the sequence is 3, 10, 5, 16, 8, 4, 2, 1 and that takes 7 steps.
 * 
 */

public class Chapter3Problem4
{
	public static void main (String[] args)
	{
		int counter = 0;
		int n = IBIO.inputInt ("Enter a number: ");
		
		while ( n != 1 )
		{
			if ( n % 2 == 0 )
			{	n = n / 2;
			} else
			{	n = n * 3 + 1;
			}
			counter = counter + 1;
			IBIO.out(n + " ");
		}	
		IBIO.output("\nTotal number of steps = " + counter );
	}
}

/* Output *

Enter a number: 3
10 5 16 8 4 2 1 
Total number of steps = 7

*/

