package com.oop21.w03.kodu.pangandussusteem;

public class Bank {
    private String bankName;
    private int bankCode;
    private int customersSum;
    private int workersSum;
    Customer customer;

    public Bank(String name, int code, int customers, int workers) {
        bankName = name;
        bankCode = code;
        customersSum = customers;
        workersSum = workers;
    }

    public void addCustomersAmount(int qty) {
        customersSum += qty;
    }

    public String getBankName() {
        return bankName;
    }

    public int getCustomersAmount() {
        return customersSum;
    }

    public void addWorkersAmount(int qty) {
        workersSum += qty;
    }

    public int getWorkersAmount() {
        return workersSum;
    }

    public void createNewCustomer(String newCustomerName, String newCustomerAddress, int newAccountNumber, double newAccountBalance) {
        customer = new Customer(newCustomerName, newCustomerAddress, newAccountNumber, newAccountBalance, bankName);
    }

    public String getBankData() {
        return customer.getAccountInfo();
    }
}
