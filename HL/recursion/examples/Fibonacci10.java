//
// https://www.mathsisfun.com/numbers/fibonacci-sequence.html
//
//
//
public class Fibonacci10
{
	public static void main(String[] args)
	{
		int terms = 50;		// up to which term to calculate
		long first = 0, second = 1, next = 0;
		System.out.println("Calculating up to term X" + terms + " of the Fibonacci sequence:\n");
		for(int n = 0; n <= terms; n++)
		{	if(n <= 1)		// this takes care of X0 & X1 terms: 0 and 1
				next = n;
			else
			{	next   = first + second;
				first  = second;
				second = next;
			}
			//System.out.println("X" + n + " = " + next);
		}
		System.out.println("X" + terms + " = " + next);
		System.out.println("\n");
	}
}
