public class Dog extends Animal {

    private String breed; // short, long, bald

    public Dog(String name, int yob, String breed) {
        super(name, yob);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return super.toString() + "breed: " + breed;
    }

    public void talk() {
        System.out.println("Bow wow");
    }

    public void eat() {
        System.out.println("Chomp chomp");
    }
}


