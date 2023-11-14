public class PracticalTest2023
{
	public static void main(String[] args)
	{
		IBIO.output("teacher Marcos");
		int power = 1;
		int number  = IBIO.inputInt("Enter a positive number < 10: ");
		while( number < 1 || number > 9)
		{
			number = IBIO.inputInt("Error - 0 < number < 10; re-enter: ");
		}
		for(int i = 1; i <= number; i++)
		{
			int square = i * i;
			power  = power * number;
			IBIO.out(i + " ");
			if(square < 10)
			{
				IBIO.out(" ");
			}
			IBIO.out(square + " ");
			int digits = 0;
			for(int n = power; n > 0; n = n / 10)
			{
				digits++;
			}
			for(int s = 0; s < 9-digits; s++)
			{
				IBIO.out(" ");
			}
			IBIO.output(power);
		}
	}
}
