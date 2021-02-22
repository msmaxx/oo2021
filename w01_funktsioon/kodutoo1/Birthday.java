package com.oop21.w01.kodutoo1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class Birthday {
    public static void main(String[] args) throws Exception {

        // Sünnikuupäeva sisestamine
        System.out.print("Sisestage sünniaeg vormingus PP/KK/AAAA: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        scanner.close();

        // Kuupäeva vormindamine õiges vormingus
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar birthDayDate = Calendar.getInstance();

        birthDayDate.setTime(dateFormat.parse(date));

        // Tulemuse väljastamine
        System.out.println("Vanus: " + BirthdayCalc.calculateAge(birthDayDate));
    }
}
