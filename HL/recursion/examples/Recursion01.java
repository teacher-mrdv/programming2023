public class Recursion01
{
	
	public static long factorial(int n)
	{
		IBIO.out(n + " ");	// this shows how N changes @ each recursion
		if(n <= 1)			// base case
		{	return 1;		// 0! = 1 by definition, and 1! = 1
		}
		else
		{	return n * factorial(n-1); // recursive call
		}
	}
	
	public static long fact(int n) // displays additional information
	{
		if(n < 1)			// base case
		{	return 1;		// 0! = 1 by definition
		}
		else
		{	return n * fact(n-1); // recursive call
		}
	}
	
	public static void main (String[] args)
	{
		int n = IBIO.inputInt("Enter a number: ");
		n = Math.abs(n); // convert negatives to positives
		System.out.println();
		IBIO.out(n + "!= ");
		IBIO.output( "= " + factorial(n) ); // here we call the method
		// (function) to calculate the factorial
		System.out.println();
		
		for(int i = n; i <= n+5; i++)
		{	System.out.print(i + "!= ");
			System.out.println("= " + factorial(i));
		}
		
		System.out.println();
		System.out.print(n + "!= ");
		System.out.println(fact(n)); // method without the additional display
	}
}

