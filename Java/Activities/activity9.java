import java.util.ArrayList;

public class activity9 {
    public static void main(String[] args) {
        // Create an ArrayList 
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names 
        myList.add("Shweta");
        myList.add("Shilpa");
        myList.add("Sheetal");
        myList.add("Sharvari");
        myList.add("Swara");

        // Print all names using a for loop
        System.out.println("Names in the ArrayList:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Use get() method to retrieve the 3rd name in the ArrayList
        String thirdName = myList.get(2); // Index starts from 0
        System.out.println("\nThe 3rd name in the ArrayList: " + thirdName);

        // Use contains() method to check if a name exists in the ArrayList
        String nameToCheck = "Sheetal";
        boolean containsName = myList.contains(nameToCheck);
        System.out.println("\nDoes the ArrayList contain '" + nameToCheck + "': " + containsName);

        // Use size() method to print the number of names in the ArrayList
        int size = myList.size();
        System.out.println("\nNumber of names in the ArrayList: " + size);

        // Use remove() method to remove a name from the list
        String nameToRemove = "Sheetal";
        myList.remove(nameToRemove);
        System.out.println("\nRemoved '" + nameToRemove + "' from the ArrayList.");

        // Print the size of the list again
        size = myList.size();
        System.out.println("Number of names in the ArrayList after removal: " + size);
    }
}