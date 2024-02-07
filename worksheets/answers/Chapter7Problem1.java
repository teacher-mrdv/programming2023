
public class Chapter7Problem1 {
	
	public static void main (String[] args) {
		double myPi = Math.PI;
		System.out.println( myPi );
		myPi = ((int)(myPi*1000)) / 1000.0;
		System.out.println( myPi );
	}
}

