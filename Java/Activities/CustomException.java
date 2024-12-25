


	
	public class CustomException extends Exception {
	    private String message;

	    // Constructor to initialize the custom message
	    public CustomException(String message) {
	        this.message = message;
	    }

	    // Override the getMessage() method to return the custom message
	    @Override
	    public String getMessage() {
	        return message;
	    }
	}
