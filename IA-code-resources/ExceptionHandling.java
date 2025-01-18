/*
 * ExceHandling.java
 * 
 * Example of exception handling in Java
 * This can be used as a TYPE check
 * Based on IBIO's input method
 * 
 * MRDV Jan/2019
 */
import java.util.*;

public class ExceptionHandling
{

	public static double input(String prompt) // int or double
	{	Scanner kb = new Scanner(System.in);
		double input;
		System.out.print(prompt);
		try // code that may generate a (runtime) error follows
		{
			input = kb.nextDouble();
		}
		catch (Exception e) // 'catch' the error instead of crashing the program
		{
			System.out.println("Error - abnormal input!");
			input = -1; // rogue value to show error in input
		}
		return input;
	}

	public static void main (String[] args)
	{
		double price;
		do
		{
			price = input("Enter price: $"); // 0 = free of charge
		} while(price < 0); // limit check
		System.out.printf("Price input: $%,.2f", price);
	}
}

