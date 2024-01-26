/*
 * This class will output a Diamond
 * of variable size
 * This version is fully modular...
 *  ...implementing the algorithm as a method
 * Note that methods may call other methods
 * to create an ingenious solution
 * 
 */
 
public class DiamondStringDemo
{

	// this method returns a String of <howMany> asterisks ( a line of <howMany> *s )
	static String stars(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + "*";
		}
		return output;
	}

	// this method returns a String of <howMany> spaces
	static String spaces(int howMany)
	{
		String output = ""; // empty string
		for(int i = 0; i < howMany; i++)
		{
			output = output + " ";
		}
		return output;
	}

	static void diamond(int size)
	{
		// top of the diamond
		for(int i = 1; i < size; i++)
		{
			System.out.println( spaces(size-i) +
				stars(i) + stars(i-1) );
		}
		// bottom of the diamond
		for(int i = size; i > 0; i--)
		{
			System.out.println( spaces(size-i) +
				stars(i) + stars(i-1) );
		}
	}

	public static void main(String[] args)
	{
		int s = IBIO.inputInt("Xmas tree size? ");
		System.out.println( "\n" );
		diamond(s);
	}
	
	
}

