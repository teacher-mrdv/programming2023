/*
 * Simulation of a list using arrays - advanced version
 */
public class ListArray
{
	// DO NOT MODIFY THE FIRST 55 LINES LINES OF THIS CLASS, OR THE MAIN METHOD

	public static char[] list = new char[1];
	public static int end = 0; // to keep track of the end of the list
	
	public static boolean isEmpty()
	{	return end == 0;
	}
	
	public static boolean isFull()
	{	return end == list.length;
	}
	
	public static void append(char element)
	{
		if(isFull() == true)
		{	char[] newList = new char[list.length+1];
			for(int i = 0; i < end; i++)
			{	newList[i] = list[i];
			}
			newList[end] = element;
			list = newList;
		} else {
			list[end] = element;
		}
		end++;
	}
	
	public static int indexOf(char element)
	{
		for(int i = 0; i < list.length; i++)
		{
			if(element == list[i])
			{	return i;
			}
		}
		return -1;
	}

	public static void printList()
	{
		for(int i = 0; i < end; i++)
		{	System.out.printf("%2d : %c", i, list[i]);
			if(i == end-1)
			{	System.out.println(" <-- END");
			} else {
				System.out.println();
			}
		}
	}
	
	// converts list to a String
	public static String listToString()
	{	String output = "";
		for(int i = 0; i < end; i++)
		{	output = output + list[i];
		}
		return output;
	}
	
	public static boolean replace(int index, char repl)
	{
		if(index < 0 || index > list.length)
		{	return false;
		} else {
			// your code goes here #1 X1 MARK
			return true;
		}
	}

	public static int replace(char orig, char repl)
	{	int count = 0; // count replacements made
		// your code goes here #2 X2 MARKS
		return count;
	}

	// create a method to remove directly by INDEX
	public static boolean remove(int index)
	{
		if(index < 0)
		{	return false;
		}
		// your code goes here #3 X1 MARK
		return true;  // success
	}

	public static int remove(char element)
	{	int count = 0;
		// your code goes here #4 X2 MARKS
		return count;  // success
	}
	
	// create a method to insert an element AT an index of the list
	public static void insert(char element, int position)
	{
		// your code goes here #5 X3 MARKS
	}

	public static void resize()
	{	// Writing this method may help you with the extra challenge
	}

	public boolean swap(int index1, int index2) {
		if(index1 < 0 || index1 > list.length
		|| index2 < 0 || index2 > list.length) {
			return false;
		}
		char temp = list[index1];
		list[index1] = list[index2];
		list[index2] = temp;
		return true;
	}
	
	public static void main (String[] args)
	{
		// output your name on this line //
		
// XXXXXXXXXXXXXXXXXXXX DO NOT MODIFY THE CODE BELOW THIS LINE XXXXXXXXXXXXXXXXXXXXX
		System.out.println("\nappend('*'):");
		append('*');	printList();
		System.out.println("\nappend('+'):");
		append('+');	printList();
		System.out.println("\nappend('a'):");
		append('a');	printList();
		System.out.println("\nappend('r'):");
		append('r');	printList();
		System.out.println("\nappend('t'):");
		append('t');	printList();
		System.out.println("\nappend('p'):");
		append('p');	printList();
		System.out.println("\nappend('a'):");
		append('a');	printList();
		System.out.println("\nappend('l'):");
		append('l');	printList();
		System.out.println("\nappend('e'):");
		append('e');	printList();
		System.out.println("\nList length = " + list.length);
		System.out.println("List to String: " + listToString() );
		System.out.println("\nremove('*'):" + remove('*'));
		printList();
		System.out.println("\ninsert('D', 0):");
		insert('D', 0);	printList();
		System.out.println("\ninsert('r', 9):");
		insert('r', 9);	printList();
		System.out.println("\ninsert('h', 5):");
		insert('h', 5);	printList();
		System.out.println("\ninsert('~', 6):");
		insert('~', 6);	printList();
		System.out.println("\ninsert('V', 7):");
		insert('V', 7);	printList();
		System.out.println("\nreplace(8, 'a'):" + replace(8, 'a'));
		printList();
		System.out.println("\nreplace(9, 'd'):" + replace(9, 'd'));
		printList();
		System.out.println("\nremove(10):" + remove(10));
		printList();
		System.out.println("\ninsert('+', 99):");
		insert('+', 99);	printList();
		System.out.println("List length = " + list.length);
		System.out.println("\nremove('+'):" + remove('+'));
		printList();
		System.out.println("\nappend('#'):");
		append('#');	printList();
		System.out.println("\nremove(end):" + remove(end));
		printList();
		System.out.println("\nList length = " + list.length);
		System.out.println("List to String: " + listToString() );
	}
}
/*

append('*'):
 0 : * <-- END

append('+'):
 0 : *
 1 : + <-- END

append('a'):
 0 : *
 1 : +
 2 : a <-- END

append('r'):
 0 : *
 1 : +
 2 : a
 3 : r <-- END

append('t'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t <-- END

append('p'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p <-- END

append('a'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a <-- END

append('l'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l <-- END

append('e'):
 0 : *
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e <-- END

List length = 9
List to String: *+artpale

remove('*'):1
 0 : +
 1 : a
 2 : r
 3 : t
 4 : p
 5 : a
 6 : l
 7 : e <-- END

insert('D', 0):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e <-- END

insert('r', 9):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : p
 6 : a
 7 : l
 8 : e
 9 : r <-- END

insert('h', 5):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : p
 7 : a
 8 : l
 9 : e
10 : r <-- END

insert('~', 6):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : p
 8 : a
 9 : l
10 : e
11 : r <-- END

insert('V', 7):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : p
 9 : a
10 : l
11 : e
12 : r <-- END

replace(8, 'a'):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : a
10 : l
11 : e
12 : r <-- END

replace(9, 'd'):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : l
11 : e
12 : r <-- END

remove(10):true
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : e
11 : r <-- END

insert('+', 99):
 0 : D
 1 : +
 2 : a
 3 : r
 4 : t
 5 : h
 6 : ~
 7 : V
 8 : a
 9 : d
10 : e
11 : r
12 : + <-- END
List length = 13

remove('+'):2
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r <-- END

append('#'):
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r
11 : # <-- END

remove(end):true
 0 : D
 1 : a
 2 : r
 3 : t
 4 : h
 5 : ~
 6 : V
 7 : a
 8 : d
 9 : e
10 : r <-- END

List length = 11
List to String: Darth~Vader


*/
