package com.oop21.w01.kodutoo1;

import java.util.Calendar;

public class BirthdayCalc {
    public static int calculateAge(Calendar birthDayDate) throws Exception {

        Calendar today = Calendar.getInstance();

        int todayYear = today.get(Calendar.YEAR);
        int birthDayYear = birthDayDate.get(Calendar.YEAR);

        int todayMonth = today.get(Calendar.MONTH);
        int birthDayMonth = birthDayDate.get(Calendar.MONTH);

        // aastate erinevuse arvutamine
        int currentAge = todayYear - birthDayYear;

        // parandame, kui kontrollkuupäeva praegune kuu on väiksem kui sünnikuupäev
        if (birthDayMonth > todayMonth) {
            currentAge--;
        }
        // kuude võrdsuse korral kontrollime vanust päeva kaupa
        else if (birthDayMonth == todayMonth) {

            int todayDay = today.get(Calendar.DAY_OF_MONTH);
            int birthDayDay = birthDayDate.get(Calendar.DAY_OF_MONTH);

            if (birthDayDay > todayDay) {
                currentAge--;
            }
        }
        return currentAge;
    }
}
