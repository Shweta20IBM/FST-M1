
	import java.util.HashMap;
	import java.util.Map;
public class Activity11 {
	    public static void main(String[] args) {
	        // Create a Map with Integer keys and String values
	        Map<Integer, String> colours = new HashMap<>();

	        // Add 5 random colours to the Map
	        colours.put(1, "Red");
	        colours.put(2, "Blue");
	        colours.put(3, "Green");
	        colours.put(4, "White");
	        colours.put(5, "Black");

	        // Print the Map to the console
	        System.out.println("Original Map: " + colours);

	        // Remove one colour using the remove() method
	        colours.remove(3); // Removes the colour with key 3

	        // Check if the colour "Green" exists in the Map using containsValue()
	        boolean containsGreen = colours.containsValue("Green");
	        System.out.println("Does the Map contain 'Green'? " + containsGreen);

	        // Print the size of the Map using the size() method
	        System.out.println("Size of the Map: " + colours.size());

	        // Print the updated Map
	        System.out.println("Updated Map: " + colours);
	    }
	}
