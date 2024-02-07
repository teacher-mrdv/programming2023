
public class ArrayDemo2 {

	public static void printArray(int[] a) {
		for(int i = 0; i < a.length ; i++) {
			System.out.println(i + ": " + a[i]);
		}
	}

	public static int[] clone(int[] a) {
		int[] clone = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			clone[i] = a[i];
		}
		return clone;
	}
	
	public static void main (String[] args) {
		int[] array = { 1,2,3,4,5 };
		printArray(array);
		int[] array2 = array;
		printArray(array2);
		array[0] = 9;
		printArray(array); printArray(array2);
		System.out.println(array == array2);
	}
}

