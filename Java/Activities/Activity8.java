
public class Activity8 {
	  public static void main(String[] args) {
	        try {
	            throw new CustomException("This is a custom exception message.");
	        } catch (CustomException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
