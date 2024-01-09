
public class StringDemo {
	
	public static void main (String[] args) {
		String name = " Marcos";
		String surname = " Drien ";
		String fullName = name + surname;
		System.out.println("Mr " + name); // prepend
		System.out.println(name + surname ); // apppend
		System.out.println( fullName.trim() ); // prepend
		String me = "Marcos";
		String he = me;
		String you = new String("Marcos");
		System.out.println(name == me);
		System.out.println(me == he);
		System.out.println(you == me);
		System.out.println(name.equals(me) );
		System.out.println(me.equals(he) );
		System.out.println(you.equals(me) );
	}
}

