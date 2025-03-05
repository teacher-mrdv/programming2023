/************************************************************
 *	Collection Java class									*
 *	to simulate/implement the IBO collection data structure	*
 *  02.2025													*
 ************************************************************/
public class Collection
{
	private Item start;
	private Item current;
	
	public Collection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}

	public Item getStart() {
		return start;
	}

	public void setStart(Item start) {
		this.start = start;
	}

	public Item getCurrent() {
		return current;
	}

	public void setCurrent(Item current) {
		this.current = current;
	}

	public void addItem(String data)
	// can also be a number, object, array, etc. instead of String
	{	Item newItem = new Item(data);
		if( isEmpty() ) // add first element
		{	start = newItem;
			current = start;
		} else {
			this.resetNext();
			while(current.hasNext())
			{	current = current.getNext();
			}
			current.setNext(newItem);
		}
	}
	
	public String getNext()
	{	String data = current.getData();
		current = current.getNext();
		return data;
	}

	public void resetNext()
	{	current = start;
	}

	public boolean hasNext()
	{	return current.hasNext();
	}
	/*
	calculate the size of the collection from within the Collection class,
	which is not normally an exam question
	*/
	public int size()
	{	int size = 0;			// or size = 1;
		this.resetNext();
		while(current != null)	// or current.hasNext()  with size = 1 above
		{	size++;
			this.getNext();
		}
		return size;
	}

	public String toString()
	{	String output = "";
		this.resetNext();
		while( current != null )
		{	output = output + this.getNext() + " ";
		}
		return output;
	}
		
}

