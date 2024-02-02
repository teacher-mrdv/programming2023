
public class ReverseString {

	public static String reverseString(String s) {
		String reversed = "";
		for(int i = s.length()-1; i >= 0; i--) {
			reversed = reversed + s.charAt(i);
		}
		return reversed;
	}
	
	public static void main (String[] args) {
		String s = IBIO.input("\nEnter a string: ");
		char[] sc = s.toCharArray();
		System.out.println("\n" + s + " reversed is");
		for(int i = sc.length-1; i >= 0; i--) {
			System.out.print(sc[i]);
		}
		System.out.println();
		System.out.println("\nUsing our method:");
		System.out.println( reverseString(s) );
		
	}
}

