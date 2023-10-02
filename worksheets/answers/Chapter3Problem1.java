/*
 * Chapter 3 problem 1
 * 
 * Change the program so that it only accepts numbers
 * that are even and are larger than 0 and less than 100
 */


public class Chapter3Problem1
{
	
	public static void main (String[] args)
	{
		int x;
		do
		{	x = IBIO.inputInt("Enter an even number grater than zero and less than 100: ");
		} while( x <= 0 || x >= 100 || x % 2 != 0);
		IBIO.output("Thank you");
	}
}

/* Output:

Enter an even number grater than zero and less than 100: -9
Enter an even number grater than zero and less than 100: 9
Enter an even number grater than zero and less than 100: 101
Enter an even number grater than zero and less than 100: 100
Enter an even number grater than zero and less than 100: 88
Thank you

*/
