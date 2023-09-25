/*

Chapter 1, example 4: for loop

*/

public class Example4
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 20; i++)
		{	// everything in between these { } will repeat 20 times
			IBIO.output("Hello " + i);
		}
		
		/*
		// this while loop does the same as the for loop above; the for loop abbreviates the while loop structure below:
		int i = 0;
		while(i < 20)
		{	IBIO.output( (i+1) + " hello");
			i = i + 1; // i++;
		}
		*/
	}
}


/*
Hello 0
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Hello 6
Hello 7
Hello 8
Hello 9
Hello 10
Hello 11
Hello 12
Hello 13
Hello 14
Hello 15
Hello 16
Hello 17
Hello 18
Hello 19
*/
