/*
 * input 1 number: N
 * < 1000
 *
 * search for x and y so that
 * x^2 + y^2 = N
 *
 * output x and y if x^2 + y^2 = N
 * or output "impossible" otherwise
 *
 */
		
public class Chapter4Problem3B {
	
	public static void main (String[] args) {
		boolean found = false;
		int n;
		do {
			n = IBIO.inputInt("Enter a number < 1000: ");
		} while( n >= 1000 );

		for(int x = 1; x <= n && !found; x++) {
			for(int y = 1; y <= n && !found; y++) {
				int search = x*x + y*y;
				if(search == n) {
					found = true;
					System.out.println(x + ", " + y);
				} // end if
			} // end for y
		} // end for x
		if( !found ) {
			System.out.println("Impossible");
		}
	} // end main
}

