public class ForDemo
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 20; i=i+1)
		{
			IBIO.out(i);
			IBIO.out(" ");
			// or ==> IBIO.out(i + " ");
		}

		IBIO.output("");
		IBIO.out(1); // "\n" = goes down one line (new line)
		for(int i = 3; i <= 20; i=i+2)
		{
			IBIO.out("," + i);
		}
		IBIO.output("");
		IBIO.out(10);
		for(int i = 9; i > 0; i--)
		{
			IBIO.out("," + i);
		}
		IBIO.output(" ***Boom***");
		IBIO.output("That's all folks!");
	}
}

