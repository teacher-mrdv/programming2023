/*
 * This is the definition (class) of a node for an ADT
 * Singly-linked node
 *  _____________
 * | data | next |
 * | (int)|(Node)|
 * |______|______|
 *
 * null = empty, non-existent, void
 * 
 */

public class Node
{
	int data ; // data contained in our node; it can be any data type
	Node next; // self-reference (Node refers/links/points to another node)

	// empty constructor (OOP) creates an empty node (initialises the data and next variables to defaults)
	public Node() { }

	// custom constructor that creates and initialises a node with data (integer "d" in this example)
	public Node(int d)
	{
		data = d;
		next = null;
	}
	// ^^^^^ this is an example of overloading methods ^^^^^^

	// is the (current) node linked to another node or does it point to null?
	public boolean hasNext()
	{	return next != null;
	}

	public String toString() {
		return Integer.toString(data);
	}
}

