public class ZooLLController {
    public static void main(String[] args) {
        ZooLL myZoo = new ZooLL("SGZoo");
        Dog cujo = new Dog("Fido", 2021, "Terrier");
        Dog pup = new Dog("Fido", 2021, "Terrier");
        Cat catty = new Cat("Paws", 2022, "short");
        myZoo.addAnimal(cujo);
        myZoo.addAnimal(catty);
        catty = new Cat("Aramis", 2019, "long");
        myZoo.addAnimal(catty);
        catty = new Cat("Meow", 2023, "long");
        myZoo.addAnimal(catty);
        Zoo sgZoo = new Zoo("OSF");
        sgZoo.addAnimal(cujo);
        sgZoo.addAnimal(catty);

        System.out.println("cujo == pup? " + (cujo == pup));
        System.out.println(cujo.hashCode() + " == " +
                pup.hashCode() + " : " +
                (cujo.hashCode() == pup.hashCode()));

        System.out.println(sgZoo);
        System.out.println(myZoo);
        cujo.setName("Bob");
        myZoo.removeAnimal(2);
        System.out.println(sgZoo);
        System.out.println(myZoo);
    }
}
