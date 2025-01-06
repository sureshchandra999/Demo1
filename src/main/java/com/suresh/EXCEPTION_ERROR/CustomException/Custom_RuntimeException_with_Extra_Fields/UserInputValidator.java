package com.suresh.EXCEPTION_ERROR.CustomException.Custom_RuntimeException_with_Extra_Fields;

public class UserInputValidator {
    public static void main(String[] args) {
        try {
            validateUserInput("", "email");
            System.out.println("Before..");
            validateUserInput("", "password");
            System.out.println("After");
        } catch (InvalidUserInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Field: " + e.getField());
            System.out.println("Reason: " + e.getReason());
        }

        try {
            validateUserInput("", "username");
        }catch (InvalidUserInputException e){
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Field: " + e.getField());
            System.out.println("Reason: " + e.getReason());
        }

    }

    public static void validateUserInput(String input, String fieldName) {
        if (input == null || input.isEmpty()) {
            throw new InvalidUserInputException(fieldName, "Input cannot be null or empty");
        }

        if ("email".equals(fieldName) && !input.contains("@")) {
            throw new InvalidUserInputException(fieldName, "Email must contain '@' character");
        }

        // Additional validation logic...
    }
}
