import java.util.Date;

public class Animal
{
    private String name;
    private int yob; // year of birth
    private static int animalCounter = 0;

    public Animal() {
        this.name = "animalito";
        Date now = new Date(); // gets current datestamp
        // dependency: uses-a
        // Animal uses Date to get the current data/year
        this.yob = 1900 + now.getYear();
        animalCounter++;
    }

    public Animal(String name) {
        this.name = name;
        Date now = new Date();
        this.yob = 1900 + now.getYear(); // dependency: Animal uses Date
        animalCounter++;
    }

    public Animal(String name, int yob) {
        this.name = name;
        this.yob = yob;
        animalCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void talk() {
        System.out.println("Animals don't talk, do they?");
    }

    public void eat() {
        System.out.println("All animals eat... something");
    }

	public static int geAnimalCounter() {
		return animalCounter;
	}

    @Override
    public String toString() {
        return "Class: " + this.getClass().getName() + " | name: " + name +
                " | year of birth: " + yob + " | ";
    }

}
