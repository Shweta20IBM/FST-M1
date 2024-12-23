@FunctionalInterface
interface Addable {

    int add(int num1, int num2);
}
public class activity12 {
	  public static void main(String[] args) {
	
	        Addable ad1 = (num1, num2) -> num1 + num2;

	      
	        Addable ad2 = (num1, num2) -> {
	            int result = num1 + num2;
	            return result;
	        };

	       
	        int result1 = ad1.add(10, 20);
	        int result2 = ad2.add(30, 40);

	        // Print the results
	        System.out.println("Result from ad1 (no body): " + result1);
	        System.out.println("Result from ad2 (with body): " + result2);
	    }
	
}
