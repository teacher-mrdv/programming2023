public class CollectionDemo
{
	public static int collectionSize(Collection c)
	{	int counter = 0;
		Element temp = c.getStart();
		while(temp != null) {
			temp = temp.getNext();
			counter++;
		}
		return counter;
	}
	public static void main (String[] args)
	{
		Collection list = new Collection();
		list.addItem("Ada"); System.out.println(list);
		list.addItem("Ali"); System.out.println(list);
		list.addItem("Bob"); System.out.println(list);
		list.addItem("Jill"); System.out.println(list);
		list.addItem("Kyle");
		System.out.println("OOOO");
		System.out.println(list);
		System.out.println(collectionSize(list));
	}
}

