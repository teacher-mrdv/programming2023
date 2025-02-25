/*
 * May 23
 * Paper 2
 * Question 16.c
 */


public class Paper2 {

	LinkedList<Client> openDay = new LinkedList<>();
	// populated already ^
	public static void enList(Client newClient)
	{
		if(root == null)
		{	root = newClient;
			return;
		}
		ClientNode temp = root;
		while(temp.getNext() != null)
		{	temp = temp.getNext();
		}
		temp.setNext(newClient);
	}
	//	OR
	public static void enList(Client newClient)
	{
		if(root == null)
		{	root = newClient;
			return;
		}
		ClientNode temp = root;
		while(temp.hasNext())
		{	temp = temp.getNext();
		}
		temp.setNext(newClient);
	}

	
	public static void main (String[] args) {
		
	}
}

