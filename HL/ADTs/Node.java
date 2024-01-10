/*
 * This is the definition (class) of a node for an ADT
 * Singly-linked node
 *  _____________
 * | data | Node |
 * | (int)| /null|
 * |______|______|
 * 
 */

public class Node
{
	int data;
	Node next; // self-reference (Node refers/links/points to another node)

	// empty constructor (OOP) creates an empty node
	public Node() { }

	// custom constructor that creates and initialises a node
	public Node(int d)
	{
		data = d;
	}

	// is the (current) node linked to another node or does it point to null?
	public boolean hasNext()
	{	return next != null;
	}

	// this method converts a Node object to a String representation
	public String toString()
	{
		return this.data + "";
	}
}

