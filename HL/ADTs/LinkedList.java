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
        // your code here
    }

    public void append(Node n)
    {
        // your code here
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
        // your code here to delete any other node after the first/start one
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

}
