package javacoursepackage;

class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}


public class Program2 {
	
	static void agecheck(int age){
		if (age<18) {
			throw new InvalidAgeException("Invalid Age Entered");
		}
	}
	
	public static void main(String[] args) {
		try {
			agecheck(16);
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}

	}

}
