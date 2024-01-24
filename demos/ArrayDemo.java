//import java.util.Arrays;

public class ArrayDemo {
	
	public static void main (String[] args) {
		int x = -1;
		String s; //null/not initialised
		s=""; // empty string
		//int[] numbers = new int[10];
		int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };
		System.out.println(x);
		System.out.println(s);
		System.out.println(numbers);
		//System.out.println(Arrays.toString(numbers)); // you can't touch this
		for(int index = 0; index < numbers.length; index++) {
			numbers[index] = numbers[index] * 3;
		}
		for(int index = 0; index < numbers.length; index++) {
			System.out.println("[" + index + "] " + numbers[index] + " ");
		}
		System.out.println("\n\nIn reverse:");
		for(int index = numbers.length-1; index >= 0 ; index--) {
			System.out.println("[" + index + "] " + numbers[index] + " ");
		}
		System.out.println("\n\n");
		for(int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index] + ' ');
		}
	}
}

