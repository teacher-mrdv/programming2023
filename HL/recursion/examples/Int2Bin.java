/****************************************
 * Solving the denary to binary problem
 *	using recursion
 * IB HL CompSci
 * 14.11.2024
 * v.2.0
 ****************************************/

import java.util.Scanner; // to input data

public class Int2Bin
{
	// brainstorming ideas...
	public static int den2binA(int d)
	{
		if( d == 0 )
		{	return 0;
		}
		System.out.println( d % 2 );
		return den2binA(d/2);
	}
	
	// void methods return nothing, we use them
	// when we want to output data rather than returning it
	public static void den2bin(int d)
	{
		if( d == 0 )
		{	return;
		}
		den2bin(d/2);	// note that we call the method first
		System.out.print( d  % 2 ); // and then we output the modulo
	}
	
	public static void main (String[] args)
	{
		den2binA(26);
		System.out.println("\n\n");
		den2bin(26);
		/*
		System.out.print("\n\nEnter an integer: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(n + " base 10 = ");
		den2bin( n );
		System.out.println(" base 2.");
		System.out.println();
		*/
	}
}

