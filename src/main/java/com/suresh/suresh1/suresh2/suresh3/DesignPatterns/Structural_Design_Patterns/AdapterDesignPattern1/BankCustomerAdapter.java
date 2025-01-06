package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Structural_Design_Patterns.AdapterDesignPattern1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

//Step 3
//
//Create a BankCustomer class (Adapter class).
public class BankCustomerAdapter extends BankDetails implements CreditCard{

    // This is the adapter class
    /**
     *
     */
    @Override
    public void giveBankDetails() {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the Account Holder Name :::::");
            String customerName=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the Account Number:::::");
            long accNumber=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the Bank Name :");
            String bankName=br.readLine();

            setAccHolderName(customerName);
            setAccNumber(accNumber);
            setBankName(bankName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @return
     */
    @Override
    public String getCreditCard() {

        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();
        return  ("The Account number "+accno+" of "+accholdername+" in "+bname+ " " +
                "bank is valid and authenticated for issuing the credit card. ");
    }
}
