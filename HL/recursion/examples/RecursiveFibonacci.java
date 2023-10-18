/*
 * https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 */

import java.util.Scanner;

public class RecursiveFibonacci
{
	static long counter = 0;
	
	public static long fibonacci(int n)
	{
		counter++;
		if( n == 0 )
			return 0;
		else if( n == 1 || n == 2 )
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args)
	{
// 		Scanner in = new Scanner(System.in);
// 		System.out.print("Up to which term? ");
// 		String temp = in.nextLine();
// 		int x = Integer.parseInt(temp);
		int x = 40;
		//System.out.println( fibonacci(x) );
		System.out.printf("Fibonacci term %d = %,d\n\n", x, fibonacci(x) );
		System.out.printf("%,d recursive calls to calculate term %d of the Fibonacci sequence.\n", counter, x);
	}
}
/*
Fibonacci term 40 = 102,334,155

204,668,309 recursive calls to calculate term 40 of the Fibonacci sequence.
*/

	
