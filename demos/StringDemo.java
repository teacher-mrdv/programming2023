
public class StringDemo
{
	
	public static void main (String[] args)
	{
		String name = " Marcos";
		String surname = " Drien "; // note the space at the end
		String fullName = name + surname;
		System.out.println("String name = \" Marcos\";\nString surname = \" Drien \";\nString fullName = name + surname;\n");
		System.out.println(">>> String concatenation\n");
		System.out.println("\"Mr\" + name: " + "Mr" + name); // prepend
		System.out.println("name + surname: " + name + surname ); // apppend
		System.out.println( "fullName.trim(): " + fullName.trim() ); // trim (removes spaces at the beginning and end of a String)
		String me = "Marcos";
		String he = me;
		String you = new String("Marcos");
		System.out.println("\nString me = \"Marcos\";\nString he = me;\nString you = new String(\"Marcos\");");
		String lowerCaseName = "marcos";
		System.out.println("String lowerCaseName = \"marcos\"");
		System.out.println("\n>>> String equalities\n");
		System.out.println("name == me: " + (name == me));
		System.out.println("me == he: " + (me == he));
		System.out.println("you == me: " + (you == me));
		System.out.println( "name.equals(me): " + name.equals(me) );
		System.out.println( "me.equals(he): " + me.equals(he) );
		System.out.println( "you.equals(me): " + you.equals(me) );
		System.out.println("me == lowerCaseName: " + (me == lowerCaseName));
		System.out.println( "me.equals(lowerCaseName): " + (me.equals(lowerCaseName)) );
		System.out.println("me.equalsIgnoreCase(lowerCaseName): " + (me.equalsIgnoreCase(lowerCaseName)));
		System.out.println("me.compareTo(you): " + me.compareTo(you) );
		System.out.println("me.compareTo(lowerCaseName): " + me.compareTo(lowerCaseName) );
		System.out.println("\"Kavitha\".compareTo(\"Marcos\"): " + "Kavitha".compareTo("Marcos") );
		System.out.println("\"Marcos\".compareTo(\"Kavitha\"): " + "Marcos".compareTo("Kavitha") );
		System.out.println("\"Kehan\".compareToIgnoreCase(\"Kavitha\"): " + "Kehan".compareToIgnoreCase("Kavitha") );
		System.out.println("me.toUpperCase(): " + me.toUpperCase());
		System.out.println("\"Kehan\".toUpperCase(): " + "Kehan".toLowerCase());
		System.out.println("char[] slicedString = \"Kehan\".toCharArray(): " );
		char[] slicedString = "Kehan".toCharArray();
		for(int i = 0; i < slicedString.length; i++)
		{	System.out.println(i + " " + slicedString[i] );
		}
		System.out.println("Character.toLowerCase(slicedString[0]): " + Character.toLowerCase(slicedString[0]));
	}
}

