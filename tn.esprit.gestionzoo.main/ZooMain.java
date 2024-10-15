package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooMain {

    public static void main(String[] args) {
        // Create a zoo and add animals
        Zoo myZoo = new Zoo("Esprit Zoo");

        // Add animals
        Animal lion = new Animal("Lion", 5);
        Animal tiger = new Animal("Tiger", 3);

        myZoo.addAnimal(lion);    // Should add successfully
        myZoo.addAnimal(tiger);   // Should add successfully

        // Display all animals
        myZoo.displayAnimals();

        // Try adding more animals until zoo is full
        for (int i = 0; i < 24; i++) {
            Animal newAnimal = new Animal("Animal" + (i + 1), 2);
            myZoo.addAnimal(newAnimal);
        }

        // Try to add one more animal after the zoo is full
        Animal elephant = new Animal("Elephant", 10);
        myZoo.addAnimal(elephant); // Should print "Zoo is full. Cannot add more animals."
    }
}
