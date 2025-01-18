import java.util.*;

// Please look at https://www3.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
// and http://www.tutorialspoint.com/java/util/calendar_compareto.htm
// and http://www.javacoderanch.com/how-to-calculate-difference-in-days-between-two-dates.html

public class CalendarDemo
{
	
	public static String calToStr(Calendar cal)
	{	String output = cal.get(Calendar.YEAR) + "/"
						+ (cal.get(Calendar.MONTH)+1) + "/"
						+ cal.get(Calendar.DATE);
		return output;
	}
	
	public static long daysPassed(Calendar since)
	{
		Calendar now = Calendar.getInstance();
		long millis = now.getTimeInMillis() - since.getTimeInMillis();
		long days = millis / (24 * 60 * 60 * 1000);
		return days;
	}
	
	public static void main (String args[])
	{
		Calendar now = Calendar.getInstance();
		System.out.println( "\nCurrent date: " + calToStr(now) + "\n" );
		
		Person newGuy = new Person("newGuy", "2000/11/21", 12345678);
		System.out.println( newGuy + " -> newGuy.setDob(1989, 12, 19);");
		newGuy.setDob(1989, 12, 19);
		System.out.println( newGuy + " -> newGuy.setDob(\"1990/12/31\");" );
		newGuy.setDob("1990/12/31");
		System.out.println( newGuy );
		
		Calendar birthday = newGuy.getCalDob();
		Calendar oldDate = new GregorianCalendar(1981, 2, 16);
		Calendar donkeyYearsAgo = new GregorianCalendar(1981, 2, 16);

		Scanner javaWhyYouDoThisToMe = new Scanner(System.in);
		System.out.print( "\t>>> Press return/enter to continue." );
		String dummy = javaWhyYouDoThisToMe.nextLine();
		System.out.println( );

		// compare the time values represented by two calendar objects.
		int[] a = new int[3];
		String[] s = new String[3];
		
		s[0] = newGuy.getDob()   + " compared to " + calToStr(oldDate);
		s[1] = calToStr(oldDate) + " compared to " + newGuy.getDob();
		s[2] = calToStr(oldDate) + " compared to " + calToStr(donkeyYearsAgo);
		
		a[0] = newGuy.getCalDob().compareTo(oldDate);
		a[1] = oldDate.compareTo( newGuy.getCalDob() );
		a[2] = oldDate.compareTo(donkeyYearsAgo);
		for(int i = 0; i < 3; i++)
		{	System.out.println(s[i]);
			if( a[i] < 0 )
			{	System.out.println( a[i] + " => first date < second one\n");
			}
			else if( a[i] > 0 )
			{	System.out.println( a[i] + " => first date > second one\n");
			}
			else // which implies a[i] == 0
			{	System.out.println( a[i] + " => first date = second one\n");
			}
		}
		
		System.out.printf(  "%,d days have passed since the guy's birthday (%s).\n", daysPassed( newGuy.getCalDob() ), newGuy.getDob() );
		
		System.out.println( newGuy.getName() + "'s age is " + newGuy.getAge() + " years old.");
		
	}
}

