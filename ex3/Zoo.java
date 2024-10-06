package ex3;

import ex2.Animal;

public class Zoo {
     private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private int animalCount = 0;  // Counter for number of animals

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Zoo is full. Cannot add more animals.");
            return false;
        }
    }
    // Method to display all animals in the zoo
    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Method to search for an animal by name
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;  // Return -1 if not found
    }
    // Check if the animal already exists in the zoo
    for (int i = 0; i < animalCount; i++) {
        if (animals[i].name.equals(animal.name)) {
            System.out.println("Animal already exists in the zoo.");
            return false;
        }
    }

    animals[animalCount] = animal;
    animalCount++;
    return true;
    for (int i = 0; i < animalCount; i++) {
        if (animals[i].name.equals(animal.name)) {
            // Shift the rest of the animals to fill the gap
            for (int j = i; j < animalCount - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[animalCount - 1] = null;  // Remove last animal
            animalCount--;
            return true;
        }
    }
    return false;
    private static final int nbrCages = 25;  // Zoo can contain a maximum of 25 animals
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }
}
