import java.lang.reflect.Array;
import java.util.Arrays;

public class CollectionDemo
{
	// how to calculate the size of a collection outside the Collection class
	public static int collectionSize(Collection c)
	{	int counter = 0;
		Element temp = c.getStart(); // Element = Node; start @ the beginning of the collection
		while(temp != null)
		{	counter++;
			temp = temp.getNext();
		}
		return counter;
	}

	public static void main (String[] args)
	{
		Collection list = new Collection();
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
}

