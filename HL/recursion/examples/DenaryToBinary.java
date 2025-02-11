
public class DenaryToBinary
{
	public static void den2bin(int denary)
	{
		if( denary == 0 )
		{	return;
		}
		den2bin(denary/2) ;
		System.out.print(denary % 2);
	}

	
	public static void main (String[] args)
	{
		den2bin(26);
	}
}

