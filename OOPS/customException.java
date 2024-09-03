package OOPS;

class MyException extends Exception {
    // Parameterized constructor to display a custom error message
    public MyException(String message) {
        super(message);
    }
}

class AgeValidator {
    // Method to validate the age and throw custom exception if invalid
    public static void validateAge(int age) throws MyException {
        if (age < 0 || age > 130) {
            throw new MyException("Invalid age. Age should be between 0 and 130.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}

 class CustomException {
    public static void main(String[] args) {
        try {
            // Test the age validation
            AgeValidator.validateAge(25);   // Valid age
            AgeValidator.validateAge(-5);   // Invalid age, throws MyException
            AgeValidator.validateAge(150);  // Invalid age, throws MyException
        } catch (MyException e) {
            // Catch and display the custom exception message
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
