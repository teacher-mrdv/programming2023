/*
 * This is a simple definition (class) of a node for an ADT
 * Singly-linked node; more flexible and succint so that
 * it's easier to change the data type to whatever you need
 *  _____________
 * | data | next |
 * | (-*-)|(Node)|
 * |______|______|
 *
 * null = empty, non-existent, void
 * 
 */

public class Node2
{
	String data ; // data contained in our node; String can be replaced by any data type
	Node2 next; // self-reference (Node refers/links/points to another node)

	// empty constructor (OOP) creates an empty node (defaults)
	public Node2() {
		data = null;
		next = null;
	}

	public Node2(String d) {
		data = d;
		next = null;
	}

	// is the (current) node linked to another node or does it point to null?
	public boolean hasNext()
	{	return next != null;
	}

	public String toString() {
		return data;
	}

}

