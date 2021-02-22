package com.oop21.w03.kodu.pangandussusteem;

public class MainApp {
    public static void main(String[] arg) {
        System.out.println("*************************************");
        System.out.println();
        System.out.println("WELCOME TO OOP21 BANK ");
        System.out.println();
        System.out.println("*************************************");
        System.out.println();

        Bank oop21_private = new Bank("OOP21 PRIVATE BANK", 1199321, 12567, 70);
        Bank oop21_business = new Bank("OOP21 BUSINESS BANK", 1199322, 3543, 24);

        System.out.println("! At the moment " + oop21_private.getBankName() + " has " + oop21_private.getCustomersAmount() + " clients and " + oop21_private.getWorkersAmount() + " employees.");
        System.out.println("! At the moment " + oop21_business.getBankName() + " has " + oop21_business.getCustomersAmount() + " clients and " + oop21_business.getWorkersAmount() + " employees.");

        System.out.println();
        System.out.println("*************************************");
        System.out.println();

        oop21_business.createNewCustomer("Carl Johnson", "Ranna 16", 999777333, 160403.35);

        oop21_private.createNewCustomer("Tommy Vercetti", "Vainupea 63", 888444111, 9500.90);

        oop21_business.addCustomersAmount(1);
        oop21_private.addCustomersAmount(1);

        System.out.println(oop21_business.getBankData());

        System.out.println();
        System.out.println("*************************************");
        System.out.println();

        System.out.println(oop21_private.getBankData());

        System.out.println();
        System.out.println("*************************************");
        System.out.println();

        System.out.println("! At the moment " + oop21_private.getBankName() + " has " + oop21_private.getCustomersAmount() + " clients and " + oop21_private.getWorkersAmount() + " employees.");
        System.out.println("! At the moment " + oop21_business.getBankName() + " has " + oop21_business.getCustomersAmount() + " clients and " + oop21_business.getWorkersAmount() + " employees.");

    }
}
