public class LinkedList
{
    Node start;
    int size;

	
    public LinkedList()			// creates an empty LL
    {
        start = null;
        size = 0;
    }

    public LinkedList(Node n)	// creates a new LL with a starting node
    {
        start = n;
        size = 1;
    }


    public void printLinkedList()
    {
        Node temp = start;
        System.out.print("start");
        while (temp != null)
        {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -> null\tsize: " + size);
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void append(Node n)
    {
        if( isEmpty() ) {
			start = n;
		} else {
			Node temp = start;
			while( temp.next != null ) // !temp.hasNext()
			{
				temp = temp.next;
			}
			temp.next = n;
			size++;
		}
    }

	// returns true if the deletion was successful, false otherwise
    public boolean delete(Node nodeToDelete)
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return false;
        }
        if (start.data == nodeToDelete.data)
        {	// same as pop or dequeue
            start = start.next;
            size--;
            return true;
        }
        Node previous = start;
        Node current = start.next;
        while( current != null ) {
			if( current.data == nodeToDelete.data ) {
				previous.next = current.next;
				size--;
				return true;
			}
			previous = previous.next;
			current = current.next;
		}
        return false;
    }

    public Node deleteAt(int place) // returns the Node 
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return null;
        }
        Node temp = start;
        Node deleted = null;
        int counter = 0;
        // your code here to delete the node at position 'place' - think index
        return deleted;
    }

    private void insertAt(Node n, int place)
    {
        if (isEmpty())
        {
            start = n;
            size = 1;
            return;
        }
        Node temp = start;
        // your code here to insert the node N at position 'place'
    }

    public void insertBefore(Node n, int place)
    {
        insertAt(n, place - 1);
    }

    public void insertAfter(Node n, int place)
    {
        insertAt(n, place);
    }

    // insert after a value in the LL; example
    public void insert(Node newNode, Node key)
    {
        Node temp = start;
        while(temp.next != null)
        {
            if(temp.data == key.data)
            {
                break;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

	public static void main(String[] args)
	{
		Node add = new Node(5);
		LinkedList l = new LinkedList(add);
		l.printLinkedList();
		add = new Node(3);
		l.append(add);
		l.printLinkedList();
		add = new Node(1);
		l.append(add);
		l.printLinkedList();
		add = new Node(7);
		l.append(add);
		l.printLinkedList();
		add = new Node(9);
		l.append(add);
		l.printLinkedList();
	}
}
