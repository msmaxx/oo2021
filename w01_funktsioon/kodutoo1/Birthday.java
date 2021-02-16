package com.oop21.w01.kodutoo1;

import java.util.GregorianCalendar;

public class Birthday {
    public static void main(String[] args) {

        GregorianCalendar birthDayDate = new GregorianCalendar(1999, GregorianCalendar.MARCH, 18);
        GregorianCalendar todayDayDate = new GregorianCalendar(2021, GregorianCalendar.FEBRUARY, 15);

        int years = todayDayDate.get(GregorianCalendar.YEAR) - birthDayDate.get(GregorianCalendar.YEAR);

        int todayMonth = todayDayDate.get(GregorianCalendar.MONTH);
        int birthMonth = birthDayDate.get(GregorianCalendar.MONTH);

        if (todayMonth < birthMonth) {
            years--;
        }
        else if (todayMonth == birthMonth
                && birthDayDate.get(GregorianCalendar.DAY_OF_MONTH) < birthDayDate.get(GregorianCalendar.DAY_OF_MONTH)) {
            years--;
        }
        System.out.println("Vanus " + years + " aastat");
    }
}
