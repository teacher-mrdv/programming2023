import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        String s = "978-0-590-76484-1";
        System.out.println(s);
        s = s.replace("-", "");
        System.out.println(s);
        int[] si = new int[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            si[i] = s.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(si));
    }
}
