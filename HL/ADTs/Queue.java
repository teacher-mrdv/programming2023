/*
 * Queue.java
 * 
 * 
 */


public class Queue
{
	Node head = null;
	Node tail = null;
	int size = 0;

	public boolean isEmpty()
	{	// 		abbreviated
		return head == null;
	}

	public void enQueue(int data) {
		// your code goes here
		Node newNode = new Node(data);
		if( isEmpty() ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public int deQueue() {
		if( isEmpty() == false ) {
			int data = head.data;
			head = head.next;
			size--;
			return data;
		} else {
			System.out.println("The queue is empty");
			return 0;
		}
	}

	public void printQueue() {
		Node temp = head;
		System.out.print("Size: " + size + " | HEAD <- ");
		while(temp != null) {
			System.out.print(temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println( "TAIL" );
	}
	
}
