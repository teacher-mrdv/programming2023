/*
 * Sorting algos in Java
 * String version
 */


public class SortingAlgosString
{
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-6s  ",i , a[i]);
		}
		System.out.println();
	}

	public static String[] clone(String[] a)
	{
		String[] x = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(String[] a)
	{
		// finish this for class work. Refer to sorting_algos_SL.pdf
	}

	public static void bubbleSort(String[] a)
	{
		// finish this for class work. Refer to sorting_algos_SL.pdf
		
	}

	public static void bubbleSort2(String[] a)
	{
		
	}
	
	public static void bubbleSort3(String[] a)
	{
		
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(String[] array)
	{	int c = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			String temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j].compareTo(temp) > 0)
			{	c++;
				array[j+1] = array[j];
				j--;
				System.out.print("\t>>> ");	printArray(array);
			}
			array[j+1] = temp;
		}
		System.out.println("Comparisons: " + c);
	}

	public static void main (String[] args)
	{
		String[] original = { "Kyle", "Anne", "Cyan", "Maggie", "Zeke", "Lisa" };
		// for additional discussion and testing purposes:
		//int[] original = { 12, 7, 14, 9, 5, 3 };
		//String[] original = { "12", "7", "14", "9", "5", "3" };
		//String[] original = {"Anne", "Cyan", "Kyle", "Lisa", "Maggie", "Zeke"};
		//String[] original = {"Zeke", "Maggie", "Lisa", "Kyle", "Cyan", "Anne"};
		//String[] original = { "Robert", "Boris", "Brad", "George", "David" };
		String[] selection = clone(original);
		String[] bubble = clone(original);
		String[] bubble2 = clone(original);
		String[] bubble3 = clone(original);
		String[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble (fully optimised) sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		/*
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble2 (partially optimised) sort:");
		bubbleSort2(bubble2);
		System.out.println("\nFinal result:");
		printArray(bubble2);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nBubble3 (unoptimised) sort:");
		bubbleSort3(bubble3);
		System.out.println("\nFinal result:");
		printArray(bubble3);
		System.out.println("\nOriginal array:");
		printArray(original);
		*/
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
		
	}
}
