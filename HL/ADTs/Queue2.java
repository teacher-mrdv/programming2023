/*
 * Queue2.java
 * 
 * Universal/more flexible queue class, using Node2
 * Note that we never refer to the data part, but we're
 * fully implementing a queue here
 * 
 * mrdv 2024
 * 
 */


public class Queue2
{
	Node2 head = null;
	Node2 tail = null;
	int size = 0;

	public boolean isEmpty()
	{	// 		abbreviated
		return head == null;
	}

	public void enQueue(Node2 newNode) {
		if( isEmpty() ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public Node2 deQueue() {
		if( isEmpty() == false ) {
			Node2 temp = head;
			head = head.next;
			size--;
			return temp;
		} else {
			System.out.println("The queue is empty");
			return null;
		}
	}

	public void printQueue() {
		Node2 temp = head;
		System.out.print("Size: " + size + " | HEAD <- ");
		while(temp != null) {
			System.out.print(temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println( "TAIL" );
	}
	
}

