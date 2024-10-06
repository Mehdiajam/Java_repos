package ex2;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 5: Creating a lion and a zoo
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "My Zoo";
        myZoo.city = "CityX";
        myZoo.nbrCages = 25;

        // Display zoo information (Method for display will be added later)
    }
    public static void main(String[] args) {
        // Instruction 7: Creating animals and zoo with constructors
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Zoo myZoo = new Zoo("My Zoo", "CityX", 25);

        // Test display method (to be added in Instruction 8)
         // Creating an animal and a zoo with constructors
         Animal lion = new Animal("Felidae", "Lion", 5, true);
         Zoo myZoo = new Zoo("My Zoo", "CityX", 25);
 
         // Instruction 8: Display zoo information using displayZoo()
         myZoo.displayZoo();
 
         // Directly displaying the zoo object via toString method (Instruction 9)
         System.out.println(myZoo);
 
         // Observation: The toString method gives us the ability to print the object directly
         System.out.println(lion);  // Directly printing the animal object
     }
    }

}
