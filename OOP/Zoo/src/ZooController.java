public class ZooController {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("SGZoo");
        Dog doggy = new Dog("Fido", 2021, "Terrier");
        Cat catty = new Cat("Paws", 2022, "short");
        myZoo.addAnimal(doggy);
        myZoo.addAnimal(catty);
        catty = new Cat("Aramis", 2019, "long");
        myZoo.addAnimal(catty);

        System.out.println(myZoo);
    }
}
