package CoreJava.Q12;

import java.util.Scanner;

public class CustomException {
    // class representing custom exception
    static class InvalidAgeException extends Exception {

        public InvalidAgeException(String str) {
            // calling the constructor of parent Exception
            super(str);
        }

        // class that uses custom exception InvalidAgeException
        public static class TestCustomException1 {
            // method to check the age
            static void validate(int age) throws InvalidAgeException {
                if (age < 18) {

                    // throw an object of user defined exception
                    throw new InvalidAgeException("age is not valid to vote");
                } else {
                    System.out.println("You are valid for voting");
                }
            }
            // main method
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your age:");
                int age=sc.nextInt();
                try {
                    // calling the method
                    validate(age);
                } catch (InvalidAgeException ex) {
                    System.out.println("Caught the exception");

                    // printing the message from InvalidAgeException object
                    System.out.println("Exception occurred: " + ex);
                }

            }
        }
    }
}
