package com.oop21.w03.kodu.pangandussusteem;

public class Customer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private String customerBankName;
    private double customerBalance;


    public Customer(String name, String adress, int accountNum, double balance, String bankName) {
        customerName = name;
        customerAddress = adress;
        accountNumber = accountNum;
        customerBankName = bankName;
        customerBalance = balance;
    }

    public String getAccountInfo() {
        return "Account number: " + accountNumber + "\nCustomer Name: " + customerName + "\nCustomer's Address: " + customerAddress + "\nBalance: " + customerBalance + "\nBank: " + customerBankName;
    }
}
