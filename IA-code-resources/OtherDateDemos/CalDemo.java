
import java.text.SimpleDateFormat;
import java.util.*;

public class CalDemo
{

    /*
    This method calculates the number of days remaining until a future
        day within the same month.
        Its purpose is to check how many days are left before
        someone's birthday, for example. Modify to suit your needs!
     */
    public static int dayDiff(int day, int month)
    {
        Calendar now = Calendar.getInstance();
        int currentDay = now.get(Calendar.DATE);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int diff = -1; // current date is past day and month input
        if (month == currentMonth && day >= currentDay)
        {
            diff = day - currentDay;
        }
        return diff;
    }

    public static void main(String[] args)
    {
        Calendar now = Calendar.getInstance();
        // 
        System.out.println("Current Year is : " + now.get(Calendar.YEAR));
        // month start from 0 to 11
        System.out.println("Current Month is : " + (now.get(Calendar.MONTH) + 1));
        System.out.println("Current Date is : " + now.get(Calendar.DATE));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = input.nextInt();
        System.out.print("Enter month: ");
        int m = input.nextInt();
        System.out.print("Enter day: ");
        int d = input.nextInt();

        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(Calendar.YEAR, y);
        date.set(Calendar.MONTH, m-1);
        date.set(Calendar.DATE, d);
        
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date output = date.getTime(); // convert to printable data
        String formattedDate = myDateFormat.format(output);
        System.out.println("Input date=" + formattedDate);
        
        int daysTo = dayDiff(d, m);
        if (daysTo == 7)
        {
            System.out.println("There is one week to " + d + "/" + m);
        } else if (daysTo >= 0)
        {
            System.out.println("There are " + daysTo + " days until input date.");
        } else
        {
            System.out.println("Invalid date input");
        }

    }
}
/*
Sources:
http://www.java2s.com/Tutorial/Java/0040__Data-Type/0580__Calendar.htm
http://www.java2s.com/Tutorial/Java/0040__Data-Type/CreateaDateobjectusingtheCalendarclass.htm
https://www.ntu.edu.sg/home/ehchua/programming/java/DateTimeCalendar.html
http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
 */
