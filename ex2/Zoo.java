package ex2;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructor with parameters
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[25]; // Zoo can contain a maximum of 25 animals
    }
     // Method to display zoo information
     public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    // Method to display directly with println (For Instruction 9)
    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages;
    }
}
