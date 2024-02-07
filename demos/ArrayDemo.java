//import java.util.Arrays;

public class ArrayDemo {

	public static void printArray(int[] a) {
		for(int i = 0; i < a.length ; i++) {
			System.out.println(i + ": " + a[i]);
		}
	}

	public static void doubleArray(int[] a) {
		for(int i = 0; i < a.length ; i++) {
			a[i] = a[i] * 2;
		}
	}
	
	public static void main (String[] args) {
		int x = -1;
		String s; //null/not initialised
		s=""; // empty string
		//int[] numbers = new int[10];
		int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };
		int[] nos = numbers;
		int[] nums = { 1,2,3,4,5,6,7,8,9,10 };
		int[] ax = new int[3]; printArray(ax);
		int[] bx = new int[3]; printArray(bx);
		System.out.println(ax == bx);
		System.out.println(x);
		System.out.println(s);
		System.out.println(numbers);
		System.out.println(numbers == nos);
		System.out.println(numbers == nums);
		
		
		//System.out.println(Arrays.toString(numbers)); // you can't touch this

		for(int index = 0; index < numbers.length; index++) {
			System.out.println("[" + index + "] " + numbers[index] + " ");
		}
		System.out.println("\n\nIn reverse:");
		for(int index = numbers.length-1; index >= 0 ; index--) {
			System.out.println("[" + index + "] " + numbers[index] + " ");
		}
		/*
		System.out.println("\n\n");
		for(int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index] + ' ');
		}
		*/

		System.out.println("\nDoubling arrays");
		doubleArray(nos);
		printArray(nos);
		System.out.println();
		printArray(numbers);
	}
}

