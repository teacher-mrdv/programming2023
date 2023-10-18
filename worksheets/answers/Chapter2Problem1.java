public class Chapter2Problem1 // 2.1
{
	public static void main (String args[])
	{
		int a = IBIO.inputInt("Input a number between 50 & 60 ");

		if(a<50)
		{	IBIO.output("That number was too small.");
		}
		if(a>60)
		{	IBIO.output("That number was too big.");
		}
	}
}