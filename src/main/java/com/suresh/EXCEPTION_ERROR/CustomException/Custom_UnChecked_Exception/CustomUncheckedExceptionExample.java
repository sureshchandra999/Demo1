package com.suresh.EXCEPTION_ERROR.CustomException.Custom_UnChecked_Exception;

public class CustomUncheckedExceptionExample {

    public static void main(String[] args) {
        try {
            validateNumber(-1);
        } catch (CustomUncheckedException e) {
            System.out.println("Exception caught:: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) {
        if (number < 0) {
            throw new CustomUncheckedException("Number must be non-negative..");
        }
    }
}
