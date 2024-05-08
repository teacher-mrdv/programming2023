public class LinkedListAnswer
{
    Node start;
    int size;

    public LinkedList()
    {
        start = null;
        size = 0;
    } // creates an empty LL

    public LinkedList(Node n) // creates a new LL with a starting node
    {
        start = n;
        size = 1;
    }

    public boolean isEmpty()
    {
        return start == null;
    }

    public void append(Node n)
    {
        if (isEmpty())
        {
            start = n;
            size = 1;
            return;
        }
        Node temp = start;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = n;
        size++;
    }

    public boolean delete(Node nodeToDelete)
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return false;
        }
        if (start.data == nodeToDelete.data)
        {
            start = start.next;
            size--;
            return true;
        }
        Node prev = start;
        Node current = start.next;
        while (current != null)
        {
            if (current.data == nodeToDelete.data) // also current.data.equals(nodeToDelete.data)
            {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = prev.next;
            current = current.next;
        }
        return false;
    }

    public Node deleteAt(int place)
    {
        if (isEmpty())
        {
            System.out.println("Error-linked list is empty");
            return null;
        }
        Node temp = start;
        Node deleted = null;
        int counter = 0;
        place = Math.abs(place); // no negatives

        if( place == 0 )
        {
            delData = start.data;
            start = start.next;
            size--;
            return delData;
        }
        
        while(counter < size)
        {
            if(counter == place)
            {
                deleted = temp;
                temp = temp.next;
                size--;
                break;
            }
            temp = temp.next;
            counter++;
        }
        
        return deleted;
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

    private void insertAt(Node n, int place)
    {
        if (isEmpty())
        {
            start = n;
            size = 1;
            return;
        }
        Node temp = start;
        int counter = 1;
        while (counter < place)
        {
            temp = temp.next;
            counter++;
        }
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public void insertBefore(Node n, int place)
    {
        insertAt(n, place - 1);
    }

    public void insertAfter(Node n, int place)
    {
        insertAt(n, place);
    }

    // insert after a value in the LL
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
