
public class Chapter6Problem2 {

	// returns a String of s repeated times times
	static String repeat(int times, String s)
	{
		String output = ""; // empty string
		for(int i = 0; i < times; i++)
		{
			output = output + s;
		}
		return output;
	}
	
	public static void main (String[] args) {
		int lines = 6; // IBIO.inputInt("How many lines: ");
		for(int i = 1; i < lines; i++) {
			System.out.println( repeat( i, "* " ) );
		}
		//System.out.println("descending loop");
		for(int i = lines; i > 0; i--) {
			System.out.println( repeat( i, "* " ) );
		}
	}
}


/*
CODE OUTPUT:


*
**
***
****
*****
******
*****
****
***
**
*


*/
