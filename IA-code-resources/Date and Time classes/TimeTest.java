
public class TimeTest
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Time Class Testing\n==================\n");

        Time zero = new Time();
        System.out.println("Objective		     Expected output   Your code's output");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("No argument constructor              [00:00] = ");
        System.out.println(zero);
        zero.setHours(3);
        zero.setMinutes(360);
        System.out.print("setHour(3); setMinute(360);          [09:00] = ");
        System.out.println(zero);

        Time t1 = new Time(15, 45);
        System.out.print("Constructor with (15, 45)            [15:45] = ");
        System.out.println(t1);

        Time t2 = new Time(-533);
        System.out.print("Minutes only constructor with (-533) [08:53] = ");
        System.out.println(t2);

        Time t3 = new Time(2, 97);
        System.out.print("Constructor with (2, 97)             [03:37] = ");
        System.out.println(t3);

        Time t4 = new Time(-80, -90);
        System.out.print("Constructor with (-80, -90), getters  [9:30] = ");
        System.out.println(t4.getHours() + ":" + t4.getMinutes());

        System.out.print("toMinutes method with " + t1 + "            [945] = ");
        System.out.println(t1.toMinutes() + " minutes");

        System.out.print("toMinutes method with " + t2 + "            [533] = ");
        System.out.println(t2.toMinutes() + " minutes");
        
        System.out.print("equals method with " + t1 + " and " + t2 + "   [false] = ");
        System.out.println(t1.equals(t2) );

        System.out.print("compareTo method with " + t2 + " and " + t1 + " [-412] = ");
        System.out.println(t2.compareTo(t1) );
        

        System.out.print("diff method with " + t1 + " and " + t2 + "      [1028] = ");
        System.out.println(t1.diff(t2) + " minutes");

        System.out.print("diff method with " + t3 + " and " + t4 + "       [353] = ");
        System.out.println(t3.diff(t4) + " minutes");
        
        Event xmas = new Event("Xmas", "home", new Date(25,12,2020), new Time(19,00));
        System.out.println(xmas);

    }

}
