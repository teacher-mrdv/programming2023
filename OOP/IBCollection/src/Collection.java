/************************************************************
 *	Collection Java class									*
 *	to simulate/implement the IBO collection data structure	*
 *  02.2025													*
 ************************************************************/
public class Collection
{
	private Element start;
	private Element current;
	
	public Collection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}

	public Element getStart() {
		return start;
	}

	public void setStart(Element start) {
		this.start = start;
	}

	public Element getCurrent() {
		return current;
	}

	public void setCurrent(Element current) {
		this.current = current;
	}

	public void addItem(String data)
	// can also be a number, object, array, etc. instead of String
	{	Element newElement = new Element(data);
		if( isEmpty() ) // add first element
		{	start = newElement;
			current = start;
		} else {
			this.resetNext();
			while(current.hasNext())
			{	current = current.getNext();
			}
			current.setNext(newElement);
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

