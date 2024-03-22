
public class Stack2
{
	Node2 top = null;
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

	public void push(Node2 newNode)
	{
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public Node2 pop()
	{
		if( isEmpty() == false ) {
			Node2 temp = top;
			top = top.next;
			size--;
			return temp;
		} else {
			System.out.println("The stack is empty");
			return null;
		}
	}

	public Node2 peek()
	{
		if( isEmpty() == false ) {
			return top;
		} else {
			System.out.println("The stack is empty");
			return null;
		}
	}

	public void printStack()
	{
		Node2 temp = top;
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
		Node2 temp = top;
		while(temp != null)
		{
			counter++;
			temp = temp.next;
		}
		return counter;
	}


}

