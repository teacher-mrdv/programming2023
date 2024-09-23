/*
 * 1. complete the class below
 * 2. create a dog subclass with the additional attribute String breed
 * 3. make sure your class includes all necessary methods so that the
 *    Test class works
 *
 */

public class Cat extends Animal {
    private String coat; // short, long, bald

    public Cat(String name, int yob, String coat) {
        super(name, yob);
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String toString() {
        return super.toString() + "coat: " + coat;
    }

    public void talk() {
        System.out.println("Meow meow");
    }

    public void eat() {
        System.out.println("Nibble nibble");
    }
}
