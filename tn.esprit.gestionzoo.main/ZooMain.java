package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;


public class ZooMain {
    public static void main(String[] args) {
        
        Aquatic aquaticAnimal = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();
        Terrestrial terrestrialAnimal = new Terrestrial();
        
        System.out.println("Aquatic, Dolphin, Penguin, and Terrestrial instances created.");


        // Create instances using parameterized constructors
        Dolphin dolphin = new Dolphin("Flipper", 7, "Ocean", 50.5f);
        Penguin penguin = new Penguin("Pingu", 5, "Arctic", 100.0f);
        Terrestrial elephant = new Terrestrial("Dumbo", 10, 4);

        // Display the objects using toString()
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(elephant);
        dolphin.swim();  
        penguin.swim();
    }
}