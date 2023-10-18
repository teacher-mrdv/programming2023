public class Chapter2Problem2 // 2.2
{
	public static void main (String args[])
	{
		int a = IBIO.inputInt("Input any number ");

		if(a%2 == 0)
		{	IBIO.output(a + " is EVEN.");
		}	
		if(a%2 != 0)
		{	IBIO.output(a + " is ODD.");
		}
	}
}