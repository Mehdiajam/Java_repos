package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;  // where the animal lives (e.g., ocean, river)
    
    // Default constructor
    public Aquatic() {
    }

    // Parameterized constructor
    public Aquatic(String name, int age, String habitat) {
        super(name, age);  // call Animal constructor
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
