public class RecursiveFactorial
{
	static long counter = 0;
	public static long rfactorial (int n)
	{
		counter++;
		//System.out.println(n);
		if( n == 0 )
			return 1;
		else
			return ( n * rfactorial( n - 1 ) );
	}
	
	public static void main(String[] args)
	{
		int x = 20;
		//System.out.println( x + "! = " + rfactorial(x) );
		System.out.printf("\n\n%d! = %,d\n\n", x, rfactorial(x) );
		System.out.printf("%,d recursive calls to calculate %d!\n", counter, x);
	}
}

/*
20! = 2,432,902,008,176,640,000

21 recursive calls to calculate 20!
*/
	
