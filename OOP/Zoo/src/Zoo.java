public class Zoo {
    private static final int MAXCAPACITY = 100;
    private String name;
    private Animal[] animals;   // aggregation class relationship
    // write the constructor(s), setters, getters and toString!

    public Zoo(String name) {
        this.name = name;
        animals = new Animal[MAXCAPACITY];
    }

    public Zoo(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Animal getAnimal(int index) {
        if(index < 0 || index >= animals.length) {
            System.out.println("Invalid index");
            return null;
        }
        if(animals[index] != null) {
            System.out.println("Animal not found.");
            return null;
        }
        return animals[index];
    }

    public void setAnimal(int index, Animal animal) {
        if(index < 0 || index >= animals.length) {
            System.out.println("Invalid index");
            return;
        }
        if(animals[index] == null) {
            animals[index] = animal;
        }
    }

    public int getPopulation() {
        int population = 0;
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                population++;
            }
        }
        return population;
    }

    public void addAnimal(Animal animal) {
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }
    }

    public Animal removeAnimal(int index) {
        if(index < 0 || index >= animals.length) {
            System.out.println("Invalid index");
            return null;
        }
        Animal deleted = animals[index];
        animals[index] = null;
        return deleted;
    }

    public String toString() {
        String output = "Zoo name: " + name + "\n";
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] != null) {
                output = output + animals[i] + "\n";
            }
        }
        output = output + "Population of the zoo " + getName() +
                " = " + getPopulation() + "\n";
        return output;
    }

}
