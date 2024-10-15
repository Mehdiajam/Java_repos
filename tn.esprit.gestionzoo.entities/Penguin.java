package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;  // depth of swimming in meters

    // Default constructor
    public Penguin() {
    }

    // Parameterized constructor
    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public String toString() {
        return "Penguin [Name: " + name + ", Age: " + age + ", Habitat: " + habitat + 
               ", Swimming Depth: " + swimmingDepth + " meters]";
    }
}
