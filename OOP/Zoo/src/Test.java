public class Test {
    public static void main(String[] args) {
        // NEW calls the constructor and instantiates ahMeng
        // the parameters initialise the object's (ahMeng's) attributes
        System.out.println("Animal Superclass");
        Animal ahMeng = new Animal("Ah Meng");
        System.out.println(ahMeng); // default output: Animal@75bd9247
        System.out.println(ahMeng.getName() + " was born " + ahMeng.getYob());
        ahMeng.setName("Meng"); // a setter allows us to modify an attribute
        System.out.printf( "Name: %-10s | Birth Year: %4d\n", ahMeng.getName(), ahMeng.getYob() );
        ahMeng.talk();
        ahMeng.eat();
        System.out.println("\nCAT");
        Cat boots = new Cat("Pib", 2018, "long");
        System.out.println(boots);
        boots.setCoat("short");
        System.out.println(boots.getCoat());
        boots.talk();
        boots.eat();
        System.out.println("\nDOG");
        Dog fido = new Dog("Fido", 2020, "Terrier");
        System.out.println(fido);
        fido.setBreed("bulldog");
        System.out.println(fido.getBreed());
        fido.talk();
        fido.eat();

    }
}

/*  OUTPUT (so far)

    Class: Animal | name: Ah Meng | year of birth: 2024 |
    Ah Meng was born 2024
    Name: Meng    | Birth Year: 2024
    Animals don't talk, do they?
    All animals eat... something

*/