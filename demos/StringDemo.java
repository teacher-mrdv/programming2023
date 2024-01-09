
public class StringDemo {
	
	public static void main (String[] args) {
		String name = " Marcos";
		String surname = " Drien ";
		String fullName = name + surname;
		System.out.println("String name = \" Marcos\";\nString surname = \" Drien \";\nString fullName = name + surname;\n");
		System.out.println(">>> String concatenation\n");
		System.out.println("\"Mr\" + name: " + "Mr" + name); // prepend
		System.out.println("name + surname: " + name + surname ); // apppend
		System.out.println( "fullName.trim(): " + fullName.trim() ); // trim (removes spaces at the beginning and end of a String)
		String me = "Marcos";
		String he = me;
		String you = new String("Marcos");
		System.out.println("\n>>> String equalities\n");
		System.out.println("name == me: " + (name == me));
		System.out.println("me == he: " + (me == he));
		System.out.println("you == me: " + (you == me));
		System.out.println( "name.equals(me): " + name.equals(me) );
		System.out.println( "me.equals(he): " + me.equals(he) );
		System.out.println( "you.equals(me): " + you.equals(me) );
	}
}

