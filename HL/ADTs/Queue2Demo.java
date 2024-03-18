/*
 *
 * Use this class to test your Queue2.java class
 * mrdv 2024
 * 
 * https://www.baeldung.com/java-printstream-printf
 * https://www.digitalocean.com/community/tutorials/java-printf-method
 * 
 */

public class Queue2Demo
{
	
	public static void main (String[] args)
	{
		Queue2 q = new Queue2();
		// input integers until 0 is input
		// display the queue as it gets populated
		String input;
		//int queueSize = 0;
		System.out.println("Creating a queue:");
		do
		{
			input = IBIO.input("enter an String (empty ends): ");
			if( input.length() != 0 )
			{	Node2 newNode2 = new Node2();
				newNode2.data = input;
				q.enQueue(newNode2);
				q.printQueue();
			}
		} while( input.length() != 0 );
		int queueSize = q.size;
		// Is there a better way of keeping track and getting the size of the queue?
		System.out.println("\nCopying the queue into an array:");
		String[] array = new String[queueSize];
		for(int i = 0; i < queueSize; i++)
		{	Node2 removed = q.deQueue();
			array[i] = removed.data;
			q.printQueue();
			printArray(array);
		}
	}
	
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
	}
}

/* EXPECTED OUTPUT

Creating a queue:
enter an integer (0 ends): 1
Head  <- 1 <- Tail
enter an integer (0 ends): 6
Head  <- 1 <- 6 <- Tail
enter an integer (0 ends): 2
Head  <- 1 <- 6 <- 2 <- Tail
enter an integer (0 ends): 3
Head  <- 1 <- 6 <- 2 <- 3 <- Tail
enter an integer (0 ends): 7
Head  <- 1 <- 6 <- 2 <- 3 <- 7 <- Tail
enter an integer (0 ends): 0

Copying the queue into an array:
Head  <- 6 <- 2 <- 3 <- 7 <- Tail
0 : 1
1 : 0
2 : 0
3 : 0
4 : 0
Head  <- 2 <- 3 <- 7 <- Tail
0 : 1
1 : 6
2 : 0
3 : 0
4 : 0
Head  <- 3 <- 7 <- Tail
0 : 1
1 : 6
2 : 2
3 : 0
4 : 0
Head  <- 7 <- Tail
0 : 1
1 : 6
2 : 2
3 : 3
4 : 0
Queue is empty
0 : 1
1 : 6
2 : 2
3 : 3
4 : 7

*/
