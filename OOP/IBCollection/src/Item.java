/*
 * Item, Element or Node of the Collection
 * This is the data type of the collection,
 * i.e. what the Collection is made of.
 */


public class Item
{
	private String data; // can also be a number, object, array, etc.
	private Item next;
	
	public Item() { }
	
	public Item(String data)
	{	this.data = data;
		this.next = null;
	}
	
	public boolean hasNext()
	{	return this.next != null;
	}
	
	public Item getNext()
	{	return this.next;
	}
	
	public String getData()
	{	return this.data;
	}
	
	public void setNext(Item next)
	{	this.next = next;
	}
	
	public void setData(String data)
	{	this.data = data;
	}
	
	public String toString()
	{	return this.data;
	}
	
}

