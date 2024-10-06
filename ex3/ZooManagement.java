package ex3;

import ex2.Animal;
import ex2.Zoo;

public class ZooManagement {
     public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "CityX");
        
        // Add more than 25 animals to test what happens
        for (int i = 0; i < 27; i++) {
            Animal animal = new Animal("Species" + i, "Animal" + i, i, true);
            boolean success = myZoo.addAnimal(animal);
            System.out.println("Adding Animal" + i + ": " + success);
        }
    }
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "CityX");

        // Adding some animals
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        myZoo.addAnimal(lion);

        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        myZoo.addAnimal(tiger);

        // Display animals
        System.out.println("Animals in the zoo:");
        myZoo.displayAnimals();

        // Search for the lion
        int lionIndex = myZoo.searchAnimal(lion);
        System.out.println("Lion found at index: " + lionIndex);

        // Create an identical lion and search again
        Animal lionDuplicate = new Animal("Felidae", "Lion", 5, true);
        int lionDuplicateIndex = myZoo.searchAnimal(lionDuplicate);
        System.out.println("Duplicate Lion found at index: " + lionDuplicateIndex);
    }
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo 1", "City1");
        Zoo zoo2 = new Zoo("Zoo 2", "City2");

        // Add animals to zoo1 and zoo2
        zoo1.addAnimal(new Animal("Felidae", "Lion", 5, true));
        zoo1.addAnimal(new Animal("Felidae", "Tiger", 4, true));

        zoo2.addAnimal(new Animal("Canidae", "Wolf", 3, true));

        // Compare zoos
        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("The zoo with more animals is: " + biggerZoo.name);
    }
}
