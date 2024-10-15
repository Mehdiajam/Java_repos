package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected static final int MAX_CAPACITY = 25;
    protected Animal[] animals;
    protected int animalCount;
    protected String name;

    // Constructor
    public Zoo(String name) {
        setName(name);  // Ensure name is not empty
        animals = new Animal[MAX_CAPACITY];
        animalCount = 0;
    }

    // Add Animal method with isZooFull check
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full. Cannot add more animals.");
            return false;
        }

        // Check if the animal already exists (assuming unique names)
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("Animal with this name already exists.");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    // Method to check if the zoo is full
    public boolean isZooFull() {
        return animalCount >= MAX_CAPACITY;
    }

    // Getter and Setter for zoo name with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
        this.name = name;
    }

    // Display all animals in the zoo
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            for (int i = 0; i < animalCount; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    // Get the number of animals in the zoo
    public int getAnimalCount() {
        return animalCount;
    }
}

