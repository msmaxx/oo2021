package com.oop21.w04.kt01.a_tahed;

public class Counter {

    private static int countAllLetters(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    static void detailCount(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            String word = "";

            while (i < chars.length && chars[i] != ' ') {

                word = word + chars[i];
                i++;
            }

            int countCapitalLetterA = 0, countLetterA = 0;

            if (word.length() > 0)
                for (char element : word.toCharArray()) {
                    if (element == 'A') countCapitalLetterA++;
                    if (element == 'a') countLetterA++;
                }

            double allALetters = (countCapitalLetterA + countLetterA);

            double keskmine = allALetters / countAllLetters(word);

            System.out.println("--------------------------------------------------------------------");
            System.out.println("| Sõna: " + word + " " + "| Sisaldab " + countCapitalLetterA + " suurt tähte A | ja " + countLetterA + " väikest A"
                    + " | Tähemärke kokku sõnas: " + countAllLetters(word) + " | A kokku: " + allALetters + " | A Tähtede aritmeetiline keskmine sõnas: " + keskmine);

        }
    }

    static void countWords(String str) {
        int countCapitalLetterA = 0, countLetterA = 0;

        for (char element : str.toCharArray()) {
            if (element == 'A') countCapitalLetterA++;
            if (element == 'a') countLetterA++;
        }

        int countAllALetters = countCapitalLetterA + countLetterA;

        int lettersCount = countAllLetters(str);

        String[] wordArray = str.trim().split("\\s+");
        int wordCount = wordArray.length;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("| Suurtähtede A arv: " + countCapitalLetterA + " | Väiketähtede A arv: " + countLetterA +
                " | A Tähti kokku tekstis: " + countAllALetters + " | Tähemärke kokku tekstis " + lettersCount + " |" + " Sõnu tekstis kokku: " + wordCount + " |");
    }
}
