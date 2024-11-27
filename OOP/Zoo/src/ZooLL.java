/********************************************************************
 * Zoo class, implemented with a Java LinkedList as the collection
 * to store the Zoo's animals.
 * https://www.geeksforgeeks.org/linked-list-in-java/
 * the Java library LinkedList implementation is **not** the same as
 * our own (the one that we coded in grade 11)
 * mrdv 2024
 ********************************************************************/

import java.util.LinkedList;
//
//

public class ZooLL {
    private static final int MAXCAPACITY = 100;
    private String name;
    private LinkedList<Animal> animals;   // aggregation class relationship
    // write the constructor(s), setters, getters and toString!

    public ZooLL(String name) {
        this.name = name;
        animals = new LinkedList<>();
    }

    public ZooLL(String name, LinkedList<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(LinkedList<Animal> animals) {
        this.animals = animals;
    }

    public Animal getAnimal(int index) {
        if (index < 0 || index >= animals.size()) {
            System.out.println("Invalid index");
            return null;
        }
        if (animals.get(index) == null) {
            System.out.println("Animal not found.");
            return null;
        }
        return animals.get(index); // NOTE: in Java, Linked Lists can
        // be accessed by index by the get(n), but this is done internally
        // in a sequential/linear way, not using direct access like arrays
    }

    public void setAnimal(int index, Animal animal) {
        if (index < 0 || index >= animals.size()) {
            System.out.println("Invalid index");
            return;
        }
        // if (animals.get(index) == null) { // not needed...
            animals.add(index, animal);
        //} ...as we are using the Java LinkedList class, not an array
    }

    public int getPopulation() {
        /*int population = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                population++;
            }
        }
        return population; */
        return animals.size();  // size method provided by
                                // the Java LinkedList class
    }

    public void addAnimal(Animal animal) {
        /*for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                break;
            }
        }*/
        animals.add(animal);
        // add method provided by the Java LinkedList class
    }

    public Animal removeAnimal(int index) {
        /*if (index < 0 || index >= animals.size()) {
            System.out.println("Invalid index");
            return null;
        }
        Animal deleted = animals[index];
        animals[index] = null;
        return deleted;*/
        return animals.remove(index);
        // remove method provided by the Java LinkedList class
    }

    public String toString() {
        String output = "Zoo name: " + name + "\n";
        for(Animal a : animals) {
        //for (int i = 0; i < animals.length; i++) {
            if (a != null) {
                output = output + a + "\n";
            }
        }
        output = output + "Population of the zoo " + getName() +
                " = " + getPopulation() + "\n";
        return output;
    }

}
