package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;  // speed of swimming in km/h

    // Default constructor
    public Dolphin() {
    }

    // Parameterized constructor
    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);  // call Aquatic constructor
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return "Dolphin [Name: " + name + ", Age: " + age + ", Habitat: " + habitat + 
               ", Swimming Speed: " + swimmingSpeed + " km/h]";
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
    
}
