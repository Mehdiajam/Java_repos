package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    protected int nbrLegs;  // number of legs

    // Default constructor
    public Terrestrial() {
    }

    // Parameterized constructor
    public Terrestrial(String name, int age, int nbrLegs) {
        super(name, age);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}