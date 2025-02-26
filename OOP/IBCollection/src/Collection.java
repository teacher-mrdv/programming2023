
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
		while( current != null )
		{	output = output + this.getNext() + " ";
		}
		return output;
	}
		
}

