
public class SwitchCaseDemo {
	
	public static void main (String[] args) {
		int num = IBIO.inputInt("enter a number ");
		switch (num)
		{
			case 1:
				IBIO.output("Level 1");
				//break;
			case 2:
				IBIO.output("Level 2");
				//break;
			case 3:
				IBIO.output("Level 3");
				//break;
			default:
				IBIO.output("that number was neither 1 nor 2 nor 3");
		}
	}
}

