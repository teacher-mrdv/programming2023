import java.util.Date;

public class Animal
{
    private String name;
    private int yob; // year of birth

    public Animal() {
        this.name = "animalito";
        Date now = new Date();
        this.yob = 1900 + now.getYear();
    }

    public Animal(String name) {
        this.name = name;
        Date now = new Date();
        this.yob = 1900 + now.getYear(); // dependency: Animal uses Date
    }

    public Animal(String name, int yob) {
        this.name = name;
        this.yob = yob;
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

    @Override
    public String toString() {
        return "Class: " + this.getClass().getName() + " | name: " + name +
                " | year of birth: " + yob + " | ";
    }

}
