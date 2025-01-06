package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Structural_Design_Patterns.AdapterDesignPattern1;

//Step 4
//
//Create a AdapterPatternDemo class (client class).
public class AdapterPatternDemo {
    //This is the client class.

    public static void main(String args[]){
        CreditCard targetInterface=new BankCustomerAdapter();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
