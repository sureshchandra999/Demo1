package com.suresh.EXCEPTION_ERROR.CustomException.Example_with_Custom_Data;

public class BankAccount1 {

    private double balance;

    public BankAccount1(double balance) {
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
        BankAccount1 account = new BankAccount1(1000.0);
        System.out.println("CURRENT BALANCE IS:"+account.balance);
        try {
            account.withdraw(1500.0);
        }catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage() + ". Amount: " + e.getAmount());
        }



        account.withdraw(900);
        System.out.println("After withdraw my current balance is:"+ account.balance);



    }
}
