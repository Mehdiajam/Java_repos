package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Restrict negative age
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
