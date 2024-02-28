
public class Stack
{
	Node top = null;
	int size = 0;

	public boolean isEmpty()
	{
		if( top == null )
		{	return true;
		} else {
			return false;
		}
		//return top == null;
	}

	public void push(int n)
	{
		Node newNode = new Node(n);
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public int pop()
	{
		if( isEmpty() == false ) {
			int data = top.data;
			top = top.next;
			size--;
			return data;
		} else {
			System.out.println("The stack is empty");
			return 0;
		}
	}

	public int peek()
	{
		if( isEmpty() == false ) {
			int data = top.data;
			return data;
		} else {
			System.out.println("The stack is empty");
			return 0;
		}
	}

	public void printStack()
	{
		Node temp = top;
		System.out.print("Size: " + size + " | TOP -> ");
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}

	public int size()
	{
		int counter = 0;
		Node temp = top;
		while(temp != null)
		{
			counter++;
			temp = temp.next;
		}
		return counter;
	}


}

