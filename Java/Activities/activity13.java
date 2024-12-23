import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class activity13 {
	public static void main(String[] args) {
        // Create objects
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        // Accept number inputs from the console
        System.out.println("Enter numbers to store in the list (type 'done' to finish):");
        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }

        // Check if the list is empty
        if (list.isEmpty()) {
            System.out.println("No numbers were entered. Exiting program.");
        } else {
            // Generate a random index value
            int randomIndex = indexGen.nextInt(list.size());

            // Print the value at the generated index
            System.out.println("The random index is: " + randomIndex);
            System.out.println("The value at the random index is: " + list.get(randomIndex));
        }

        // Close the Scanner
        scan.close();
    }
}
