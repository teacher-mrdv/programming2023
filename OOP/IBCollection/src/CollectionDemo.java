import java.util.Arrays;

public class CollectionDemo
{
	static Collection list = new Collection();

	// how to calculate the size of a collection outside the Collection class
	public static int collectionSize(Collection c)
	{	int counter = 0;
		Item temp = c.getStart(); // Element = Node; start @ the beginning of the collection
		while(temp != null)
		{	counter++;
			temp = temp.getNext();
		}
		return counter;
	}

	public static void main (String[] args)
	{

		System.out.println("Add Ada to the collection");
		list.addItem("Ada"); System.out.println(list);
		System.out.println("Ali Ada to the collection");
		list.addItem("Ali"); System.out.println(list);
		System.out.println("Add Bob to the collection");
		list.addItem("Bob"); System.out.println(list);
		System.out.println("Add Jill to the collection");
		list.addItem("Jill"); System.out.println(list);
		System.out.println("Add Kyle to the collection");
		list.addItem("Kyle");


		add("Daniel");

		System.out.println(list);
		System.out.print("collectionSize(list) = ");
		System.out.println(collectionSize(list));
		System.out.print("list.size() = ");
		System.out.println(list.size());

		String[] names = new String[collectionSize(list)];
		list.resetNext();
		for(int i = 0; i < collectionSize(list); i++)
		{	names[i] = list.getNext();
		}
		System.out.println(Arrays.toString(names));
	}

	/* This is how you would add an item to a specific collection...
	 * a collection object, a collection that already exists...
	 * (it has already been instantiated) WITHOUT changing the Collection class
	 * Without the definition of the collection itself, which we can't do...
	 * ...in IB papers (both 1 and 2).
	 */
	public static void add(String data)
	{	Item newItem = new Item(data);
		System.out.println("Adding " + data + " to the list collection");
		if( list.isEmpty() ) // add first element
		{	list.setStart(newItem);
			list.setCurrent(list.getStart());
		} else {
			list.resetNext();
			// do not confuse Collection's hasNext() with
			// the Item's hasNext()
			while( list.hasNext() )
			{	System.out.println(list.getNext());
			}
			list.getCurrent().setNext(newItem);
		}
	}
}

