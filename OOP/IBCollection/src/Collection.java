
public class Collection
{
	Element start;
	Element current;
	
	public Collection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}
	
	public void addItem(String data)
	// can also be a number, object, array, etc. instead of String
	{	Element newElement = new Element(data);
		if( isEmpty() ) // add first element
		{	start = newElement;
			current = start;
		} else {
			resetNext();
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
	
	public String toString()
	{	String output = "";
		this.resetNext();
		while( current.next != null )
		{	output = output + this.getNext() + " ";
		}
		return output;
	}
		
}

