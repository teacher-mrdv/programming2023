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
		
public class Chapter4Problem3 {
	
	public static void main (String[] args) {
		int n;
		boolean found = false;
		do {
			n = IBIO.inputInt("Enter a number < 1000: ");
		} while( n >= 1000 );
		exit:
		for(int x = 1; x <= n; x++) {
			for(int y = 1; y <= n; y++) {
				int search = x*x + y*y;
				if(search == n) {
					found = true;
					System.out.println(x + ", " + y);
					break exit;
				} // end if
			} // end for y
		} // end for x
		//if( !found ) {
		if( found == false ) {
			System.out.println("Impossible!");
		}
	}
}

