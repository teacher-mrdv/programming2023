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
		int counter = 0;
		int currentIndex = 0;
		// for(int currentIndex = 0; currentIndex < a.length - 1; currentIndex++)
		while( currentIndex < a.length - 1 )
		{
			int smallestIndex = currentIndex;
			String smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				counter++;
				if(a[checkIndex].compareTo(smallestValue) < 0)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			currentIndex++;
			// line below--optional, shows how the array changes with each swap
			System.out.print("\t"); printArray(a);
		}
		System.out.println("Number of comparisons made: " + counter);
	}

	public static void bubbleSort(String[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf
		boolean swapped = true;
		int counter = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		int sorted = 0; // how many elements we have sorted/bubbled up
		while (swapped) // we use swapped to check if we have to make any changes (swaps) in the array
		{	swapped = false; // assume no swaps are made
			for(int i = 0; i < a.length-1-sorted; i++) // go through the unsorted part of the array (a pass)
			{	counter++;
				if(a[i].compareTo(a[i+1]) > 0) // if the elements are not in order (ascending)
				{	String temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true; // and keep track of the fact that we've done a swap
				}
				System.out.print("\t>>> i=" + i + " "); printArray(a); // optional, shows how the array changes with each swap
			}
			sorted++; // after each pass, one more element will be sorted
			System.out.print("\t"); printArray(a); // optional, shows how the array changes with each pass
		}
		System.out.println("Number of comparisons made: " + counter);
	}
	
	// for later use
	public static void bubbleSort2(String[] a)
	{
		int counter = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		int sorted = 0; // how many elements we have sorted/bubbled up
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length-1-sorted; i++) // go through the unsorted part of the array (a pass)
			{
				counter++;
				if(a[i].compareTo(a[i+1]) > 0) // if the elements are not in order (ascending)
				{
					String temp = a[i]; // swap the two elements
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				System.out.print("\t>>> i=" + i + " "); printArray(a); // optional, shows how the array changes with each swap
			}
			sorted++; // after each pass, one more element will be sorted
			System.out.print("\t"); printArray(a); // optional, shows how the array changes with each pass
		}
		System.out.println("Number of comparisons made: " + counter);
	}
	
	public static void bubbleSort3(String[] a)
	{
		int counter = 0; // counting how how many times the sorting algo. works (compares elements inside the array)
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length-1; j++) // go through the unsorted part of the array (a pass)
			{
				counter++;
				if(a[j].compareTo(a[j+1]) > 0) // if the elements are not in order (ascending)
				{
					String temp = a[j]; // swap the two elements
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.print("\t>>> j=" + j + " "); printArray(a); // optional, shows how the array changes with each swap
			}
			System.out.print("\t"); printArray(a); // optional, shows how the array changes with each pass
		}
		System.out.println("Number of comparisons made: " + counter);
	}

	// a couple of ways to visualise the insertion sort:
	// https://youtu.be/OGzPmgsI-pQ
	// https://youtu.be/JU767SDMDvA
	public static void insertionSort(String[] array)
	{
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{
			String temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j].compareTo(temp) > 0)
			{
				array[j+1] = array[j];
				j--;
				System.out.print("\t>>> ");	printArray(array);
			}
			array[j+1] = temp;
		}
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
		
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
		
	}
}
