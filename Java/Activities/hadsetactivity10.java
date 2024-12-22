import java.util.HashSet;
public class hadsetactivity10 {

	    public static void main(String[] args) {
	        // Create a HashSet
	        HashSet<String> hs = new HashSet<>();

	        // Add 6 objects using the add() method
	        hs.add("A");
	        hs.add("B");
	        hs.add("C");
	        hs.add("D");
	        hs.add("E");
	        hs.add("F");
	        System.out.println("Size of the HashSet: " + hs.size());
	        hs.remove("C");
	        boolean isRemoved = hs.remove("G");
	        System.out.println("Was 'G' removed? " + isRemoved);
	        boolean containsBanana = hs.contains("B");
	        System.out.println("Does the HashSet contain 'B'? " + containsBanana);
	        // Print the updated Set
	        System.out.println("Updated HashSet: " + hs);
	    }
	}



