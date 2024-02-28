/*
 * StackDemo.java
 * 
 */


public class StackDemo
{
	
	// modify the following method so that it prints...
	// ...a comma-separated value list of the array elements
	public static void printArray(int[] a)
	{
		for( int i = 0; i < a.length; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();	
	}
	
	public static void main(String[] args)
	{
		System.out.println("Example of stacks:");
		Stack s = new Stack();
		if(s.isEmpty() == true)
		{	System.out.println("the stack is empty");
		}
		System.out.println("Pushing data into the stack");
		s.printStack(); // print initial state of the stack
		s.push(1);
		s.printStack(); // check state of the stack after pushing
		s.push(2);
		s.printStack();
		s.push(3);
		s.printStack();

		System.out.println("\nPopping data into the stack");
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		s.printStack();
		System.out.println(s.pop());
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,0};
		System.out.println("\nReversing the following array using a stack\nArray:");
		printArray(intArray);
		// use a stack to reverse the order of the elements of this array
		Stack reverse = new Stack();
		System.out.println("\nReverse stack:");
		for(int i = 0; i < intArray.length; i++) {
			reverse.push( intArray[i] );
			reverse.printStack();
		}
		int index = 0;
		while( !reverse.isEmpty() ) {
			intArray[index] = reverse.pop();
			printArray(intArray);
			index++;
		}
		//
		//printArray(intArray); // use this to check that your code works as intended
	}
}

