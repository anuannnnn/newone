
public class AgeValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Valid age: " + age);
    }
	}


