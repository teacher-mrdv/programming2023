
public class Stack
{
	Node top;

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
	}

	public void printStack()
	{
		Node temp = top;
		System.out.print("TOP -> ");
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("Null\n");
	}

	public static void main(String[] args)
	{
		Stack s = new Stack();
		if(s.isEmpty() == true)
		{	System.out.println("the stack is empty");
		}
		s.printStack();
		s.push(1);
		s.printStack();
		s.push(2);
		s.printStack();
		s.push(3);
		s.printStack();
	}
}

