package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Structural_Design_Patterns.AdapterDesignPattern1;

//Step 2
//
//Create a BankDetails class (Adaptee class).
public class BankDetails {

    private String bankName;
    private String accHolderName;
    private long accNumber;


    //getter setter methods
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public long getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }


}
