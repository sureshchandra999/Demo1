package com.suresh.EXCEPTION_ERROR.CustomException.Example_with_Custom_Data;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("CURRENT BALANCE IS:"+account.balance);
        try {
            account.withdraw(1500.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage() + ". Amount: " + e.getAmount());
        }

        account.withdraw(900);
        System.out.println("After withdraw my current balance is:"+ account.balance);



    }

}
