/* Chapter 1
 * Java worksheets, computer science SL
 */
public class Example3 
{
	
	public static void main (String[] args)
	{
		int a = IBIO.inputInt("enter a number ");
		int b = IBIO.inputInt("and another one ");
		int c = a * b;
		IBIO.output("the product of " + a
					+ " and " + b + " is " + c);
	}
}

/* OUTPUT:

enter a number 5
and another one 3
the product of 5 and 3 is 15

*/
