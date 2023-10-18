/* Pr. 2.4
Write a program to print out the cubes of numbers from 1 to 10
so that they line up on the right
*/

public class Chapter2Problem4
{
	public static void main (String args[])
	{
		int cube = 0;
		
		for (int i=1; i<=10; i++)
		{
			cube = i*i*i;
			String spaces = "";
			if(cube<10)
				spaces = "   ";
			else if(cube<100)
				spaces = "  ";
			else if(cube<1000)
				spaces = " ";
				
			IBIO.output(spaces + cube);
		}
	}
}

/*
   1
   8
  27
  64
 125
 216
 343
 512
 729
1000
*/
