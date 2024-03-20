/*
 * StackDemo.java
 * 
 */


public class StackDemo2
{
	
	// modify the following method so that it prints...
	// ...a comma-separated value list of the array elements
	public static void printArray(String[] a)
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
		Stack2 s = new Stack2();
		if(s.isEmpty() == true)
		{	System.out.println("the stack is empty");
		}
		System.out.println("Pushing data into the stack");
		s.printStack(); // print initial state of the stack
		Node2 add = new Node2();
		add.data = "one";
		s.push(add);
		s.printStack(); // check state of the stack after pushing
		add.data = "two";
		s.push(add);
		s.printStack();
		add.data = "tres";
		s.push(add);
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
		
		String[] strArray = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
		System.out.println("\nReversing the following array using a stack\nArray:");
		printArray(intArray);
		// use a stack to reverse the order of the elements of this array
		Stack2 reverse = new Stack2();
		System.out.println("\nReverse stack:");
		for(int i = 0; i < strArray.length; i++) {
			reverse.push( strArray[i] );
			reverse.printStack();
		}
		System.out.println("\nRewriting array:");
		int index = 0;
		while( !reverse.isEmpty() ) {
			strArray[index] = reverse.pop();
			printArray(strArray);
			index++;
		}
		//
		//printArray(intArray); // use this to check that your code works as intended
	}
}

