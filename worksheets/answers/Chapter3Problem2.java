public class Chapter3Problem2 // 3.2
{
	public static void main(String args[])
	{
		int i = 1;
		int x = 0;
		
		do
		{	x = IBIO.inputInt("Enter a number >1 : ");
		} while (x<=1);
		
		do
		{	i++;
		} while (x % i != 0);
		
		if(x == i)
		{	IBIO.output(x + " is a prime number.");
		} else
		{	IBIO.output(x + " is divisible by " + i);
		}
	}

}