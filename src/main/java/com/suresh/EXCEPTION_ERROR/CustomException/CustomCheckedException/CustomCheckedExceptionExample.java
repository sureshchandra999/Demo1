package com.suresh.EXCEPTION_ERROR.CustomException.CustomCheckedException;

import com.suresh.EXCEPTION_ERROR.CustomException.CustomCheckedException.CustomCheckedException;

public class CustomCheckedExceptionExample {

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomCheckedException e) {
            System.out.println("Exception caught:: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18 or older..");
        }
    }
}
