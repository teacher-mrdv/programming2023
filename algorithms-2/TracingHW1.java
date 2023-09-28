/*
input N
MAX = N
loop while N >= 0
    input N
    if N > MAX then
        MAX = N
    end if
end loop
output MAX
*/
public class TracingHW1 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("N = ");	// input N
		int max = n;					// MAX = N
		while( n > 0 ) {				// loop while n>0
			n = IBIO.inputInt("N = ");	// input N (with prompt)
			if(n > max) {				// if N > MAX then
				max = n;				//		MAX = N
			}							// end if
		}								// end loop
		IBIO.out("Max = ");				// optional message
		IBIO.output(max);				// output MAX
	}
}

