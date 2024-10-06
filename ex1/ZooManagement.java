import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 1: Initialize variables
        int nbrCages = 20;
        String zooName = "my zoo";

        // Display message with initial values
        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Instruction 2: Modify to take user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of cages
        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) { // Ensure the user enters an integer
            System.out.println("Veuillez entrer un nombre valide pour le nombre de cages.");
            scanner.next(); // Consume invalid input
        }
        nbrCages = scanner.nextInt();

        // Get user input for the zoo name
        System.out.print("Entrez le nom du zoo : ");
        scanner.nextLine(); // Consume the leftover newline
        zooName = scanner.nextLine();

        // Instruction 3: Display the modified message
        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Close the scanner
        scanner.close();
    }
}
