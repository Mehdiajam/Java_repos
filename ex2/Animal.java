package ex2;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructor with parameters
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    // Method to display directly with println (For Instruction 9)
    @Override
    public String toString() {
        return "Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal;
    }
}
