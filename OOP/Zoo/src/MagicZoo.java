import java.util.ArrayList;

public class MagicZoo {
    private String name;
    private ArrayList<Animal> animals;   // aggregation class relationship
    // write the constructor(s), setters, getters and toString!

    public MagicZoo(String name) {
        this.name = name;
        animals = new ArrayList<Animal>();
    }

    public MagicZoo(String name, ArrayList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Animal getAnimal(int index) {
        if(index < 0) {
            System.out.println("Invalid index");
            return null;
        }
        if(animals.get(index) != null) {
            System.out.println("Animal not found.");
            return null;
        }
        return animals.get(index);
    }

    public void setAnimal(int index, Animal animal) {
        if(index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if(animals.get(index) == null) {
            animals.set(index, animal);
        }
    }

    public int getPopulation() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal removeAnimal(int index) {
        if(index < 0 || index >= animals.size()) {
            System.out.println("Invalid index");
            return null;
        }
        Animal deleted = animals.get(index);
        animals.remove(index);
        return deleted;
    }

    public String toString() {
        String output = "Zoo name: " + name + "\n";
        for(Animal a : animals) {
                output = output + a.toString() + "\n";
        }
        output = output + "Population of the zoo " + getName() +
                " = " + animals.size() + "\n";
        return output;
    }

}
