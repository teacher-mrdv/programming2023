public class Chapter3Problem3 // 3.3
{
	public static void main(String args[])
	{
		int sum = 0;
		int digit = 0;
		int n = IBIO.inputInt("Enter a number: ");

		do
		{	digit = n % 10;		// get right most digit
			digit = digit*digit*digit;	// cube it
			sum = sum + digit;	// add to units digits
			n = n / 10;			// make new number
		} while ( n != 0);
		
		IBIO.output("The sum of the cubed digits of the number is " + sum);
	}
}