import java.util.*;
import java.text.*;

/* Please look at
 * http://www.tutorialspoint.com/java/java_date_time.htm
 * https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
 */
public class DateDemo
{
	public static String dateToString(Date date)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String output = dateFormat.format(date);
		return output;
	}

	public static Date stringToDate(String date)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dateObject = null;//new Date();
		try
		{
			dateObject = dateFormat.parse(date);
		} catch(ParseException pe)
		{
			System.out.println(pe.getMessage());
		}
		return dateObject;
	}

	public static boolean isValidDate(String date)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date temp;
		Date today = new Date();
		try
		{	temp = dateFormat.parse(date);
		} catch (ParseException pe)
		{	return false;	}
		if( temp.after(today) )	// rejects future dates; also: dateObj.before()
		{	return false;
		}
		return true;
	}

	public static String dayToString(int dow)
	{
		String output = "";
		switch(dow)
		{
			case 0 : output = "Sunday"; break;
			case 1 : output = "Monday"; break;
			case 2 : output = "Tuesday"; break;
			case 3 : output = "Wednesday"; break;
			case 4 : output = "Thursday"; break;
			case 5 : output = "Friday"; break;
			case 6 : output = "Saturday"; break;
			default: output = "Invalid day"; break;
		}
		return output;
	}

	public static String monthToString(int month)
	{
		String output = "";
		switch (month)
		{
            case 0:  output = "January"; break;
            case 1:  output = "February"; break;
            case 2:  output = "March"; break;
            case 3:  output = "April"; break;
            case 4:  output = "May"; break;
            case 5:  output = "June"; break;
            case 6:  output = "July"; break;
            case 7:  output = "August"; break;
            case 8:  output = "September"; break;
            case 9:  output = "October"; break;
            case 10: output = "November"; break;
            case 11: output = "December"; break;
            default: output = "Invalid month"; break;
		}
		return output;
	}

	public static long daysPassed(Date start)
	{
		Date now = new Date();
		long millis = now.getTime() - start.getTime(); // difference in milliseconds
		long days = millis / (24 * 60 * 60 * 1000);
		return days;
	}

	public static void main (String args[]) throws ParseException
	{
		// Create and manipulate dates ==================================
		Date now = new Date(); // get current date & time
		System.out.println( "\nCurrent date: " + now );
		System.out.println( "Current date: " + dateToString(now) + "\n" );
		int year = 2010;
		int month = 12;
		int dayOfMonth = 25;
		Date date1 = new Date( year-1900, month-1, dayOfMonth );
		// !!! year in constructor is 1900+year
		System.out.print( dateToString( date1 ) + " was " );
		System.out.println( dayToString(date1.getDay()) ); // Sat
		// check for the Date method summary @
		// https://docs.oracle.com/javase/8/docs/api/java/util/Date.html

		Date date2 = new Date();
		date2.setDate(dayOfMonth);
		date2.setMonth(month-1);
		date2.setYear(86); // same as the constructor, year is 1900+yy
		System.out.print( dateToString( date2 ) + " was ");
		System.out.println( dayToString(date2.getDay()) ); // Thu
		System.out.println( "Month: " + monthToString(date2.getMonth()) );

		// Compare dates =======================================================
		if( date1.compareTo(date2) > 0 )
			System.out.println( "date1 (" + dateToString(date1) + ") > date2(" + dateToString(date2) + ")" );
		else if( date1.compareTo(date2) < 0 )
			System.out.println( "date1 (" + dateToString(date1) + ") < date2(" + dateToString(date2) + ")" );
		else
			System.out.println( "date1 (" + dateToString(date1) + ") = date2(" + dateToString(date2) + ")" );

		// Validate and input a date ===========================================
		Scanner in = new Scanner(System.in);
		String date = "";
		boolean error = false;
		do
		{
			System.out.print("Input a date in dd/mm/yyyy format: ");
			date = in.nextLine();
			if( isValidDate(date) ) {
				error = false;
			} else {
				System.out.println("Invalid date. Please re-enter.");
				error = true;
			}
		} while( error );
		Date date3 = stringToDate(date);
		System.out.println(date3);
		System.out.println( daysPassed(date3) + " days have passed since " + date );
	}
}

