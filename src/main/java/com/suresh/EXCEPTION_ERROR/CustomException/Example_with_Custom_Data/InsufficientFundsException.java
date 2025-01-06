package com.suresh.EXCEPTION_ERROR.CustomException.Example_with_Custom_Data;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount) {
        super("Insufficient funds for transaction: " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
